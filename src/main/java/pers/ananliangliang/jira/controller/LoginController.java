package pers.ananliangliang.jira.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.ananliangliang.jira.model.User;
import pers.ananliangliang.jira.model.form.LoginForm;
import pers.ananliangliang.jira.service.UserService;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginForm form) {
        return ResponseEntity.ok(userService.login(form.getUsername(), form.getPassword()));
    }
}
