package pers.ananliangliang.jira.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.ananliangliang.jira.dto.UserDTO;
import pers.ananliangliang.jira.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    @GetMapping("")
    public List<UserDTO> getUsers() {

        return repository.findAll().stream()
                .map(user -> UserDTO.builder().id(user.getId()).name(user.getName()).build())
                .collect(Collectors.toList());
    }
}
