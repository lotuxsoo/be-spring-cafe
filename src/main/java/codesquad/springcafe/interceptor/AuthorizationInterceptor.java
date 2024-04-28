package codesquad.springcafe.interceptor;

import codesquad.springcafe.domain.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthorizationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            String redirectUri = request.getRequestURI();
            request.getSession().setAttribute("redirectUri", redirectUri);
            response.sendRedirect("/users/login");
            return false;
        }
        return true;
    }
}