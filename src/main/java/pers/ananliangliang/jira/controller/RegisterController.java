package pers.ananliangliang.jira.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.ananliangliang.jira.model.form.RegisterForm;
import pers.ananliangliang.jira.service.UserService;

@RestController
@RequiredArgsConstructor
public class RegisterController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterForm form) {
        userService.addUser(form.getUsername(), form.getPassword());
        return ResponseEntity.ok().build();
    }
}
