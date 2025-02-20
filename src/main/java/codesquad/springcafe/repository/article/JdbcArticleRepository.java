package codesquad.springcafe.repository.article;

import codesquad.springcafe.domain.Article;
import codesquad.springcafe.dto.ArticleDto;
import codesquad.springcafe.error.exception.ArticleNotFoundException;
import codesquad.springcafe.error.exception.ReplyNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class JdbcArticleRepository implements ArticleRepository {
    private final JdbcTemplate jdbcTemplate;

    public JdbcArticleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createArticle(Article article) {
        String SQL = "INSERT INTO article (writer, title, content, views, deleted, createdDate, lastModifiedDate) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(SQL, article.getWriter(), article.getTitle(), article.getContent(), article.getViews(),
                false, article.getCreatedDate(), article.getLastModifiedDate());
    }

    @Override
    public List<Article> findAllArticles() {
        String SQL = "SELECT * FROM article WHERE deleted = false";
        return jdbcTemplate.query(SQL, rowMapper());
    }

    @Override
    public Optional<Article> findByArticleId(long articleId) {
        String SQL = "SELECT * FROM article WHERE article_id = ?";
        try {
            Article article = jdbcTemplate.queryForObject(SQL, rowMapper(), articleId);
            return Optional.ofNullable(article);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public void updateViews(long articleId) {
        String SQL = "UPDATE article SET views = views+1 WHERE article_id = ?";
        int update = jdbcTemplate.update(SQL, articleId);
        if (update == 0) {
            throw new ArticleNotFoundException(articleId + " ID 게시글이 존재하지 않습니다.");
        }
    }

    @Override
    public void updateArticle(long articleId, ArticleDto articleDto) {
        String SQL = "UPDATE article SET title = ?, content = ? WHERE article_id = ?";
        int update = jdbcTemplate.update(SQL, articleDto.getTitle(), articleDto.getContent(), articleId);
        if (update == 0) {
            throw new ArticleNotFoundException(articleId + " ID 게시글이 존재하지 않습니다.");
        }
    }

    @Override
    public void deleteArticle(long articleId) {
        String SQL = "UPDATE article SET deleted = true WHERE article_id = ?";
        int update = jdbcTemplate.update(SQL, articleId);
        if (update == 0) {
            throw new ArticleNotFoundException(articleId + " ID 게시글이 존재하지 않습니다.");
        }

        String SQL2 = "UPDATE reply SET deleted = true WHERE article_Id = ?";
        jdbcTemplate.update(SQL2, articleId);
    }

    private RowMapper<Article> rowMapper() {
        return (rs, rowNum) -> {
            long articleId = rs.getLong("article_Id");
            String writer = rs.getString("writer");
            String title = rs.getString("title");
            String content = rs.getString("content");
            long views = rs.getLong("views");
            boolean deleted = rs.getBoolean("deleted");
            LocalDateTime createdDate = rs.getTimestamp("createdDate").toLocalDateTime();
            LocalDateTime lastModifiedDate = rs.getTimestamp("lastModifiedDate").toLocalDateTime();
            return new Article(articleId, writer, title, content, views, deleted, createdDate, lastModifiedDate);
        };
    }
}