package pers.ananliangliang.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.ananliangliang.jira.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getByUsername(String username);
}
