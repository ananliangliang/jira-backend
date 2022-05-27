package pers.ananliangliang.jira.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pers.ananliangliang.jira.model.User;
import pers.ananliangliang.jira.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public void addUser(String username, String rawPassword) {

        // check username is exists
        repository.getByUsername(username)
                .orElseThrow(() -> new RuntimeException("用户名[" + username + "]已经存在，请更换用户名"));

        final var password = passwordEncoder.encode(rawPassword);

        repository.save(User.builder().username(username).password(password).build());
    }

    public User login(String username, String rawPassword) {

        final var user = repository.getByUsername(username)
                .orElseThrow(() -> new AuthorizationServiceException("用户名或密码错误"));

        if (!passwordEncoder.matches(rawPassword, user.getPassword()))
            throw new AuthorizationServiceException("用户名或密码错误");

        return user;

    }
}
