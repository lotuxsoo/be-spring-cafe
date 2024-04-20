package codesquad.springcafe.controller;

import codesquad.springcafe.domain.User;
import codesquad.springcafe.dto.UserDto;
import codesquad.springcafe.dto.UserUpdateDto;
import codesquad.springcafe.repository.user.UserRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String userList(Model model) {
        List<User> users = userRepository.findAllUsers();
        model.addAttribute("users", users);
        return "user/list";
    }

    @GetMapping("/create")
    public String createForm() {
        return "user/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute UserDto userDto) {
        userRepository.createUser(userDto);
        return "redirect:/users"; // 이 uri로 리다이렉트
    }

    @GetMapping("/{userId}")
    public String userProfile(@PathVariable("userId") String userId, Model model) {
        User findedUser = userRepository.findByUserId(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        model.addAttribute("user", findedUser);
        logger.debug("프로필 조회: {}", findedUser.toDto());
        return "user/profile";
    }

    @GetMapping("/{userId}/update")
    public String updateForm(@PathVariable("userId") String userId) {
        return "user/update";
    }

    @PutMapping("/{userId}/update") // 실패하면 어떻게 되는거지? 예외처리 공부
    public String update(@PathVariable("userId") String userId, @ModelAttribute UserUpdateDto userUpdateDto) {
        userRepository.updateUser(userId, userUpdateDto);
        return "redirect:/users";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("userId") String userId, @RequestParam("password") String password) {
        User loginedUser = userRepository.findByUserId(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "사용자 조회 실패"));

        if (!loginedUser.getPassword().equals(password)) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "비밀번호가 일치하지 않습니다.");
        }

        logger.debug("로그인 사용자: {}", loginedUser.toDto());
        return "redirect:/";
    }
}