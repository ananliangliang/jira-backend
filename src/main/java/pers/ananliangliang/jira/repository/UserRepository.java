package pers.ananliangliang.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.ananliangliang.jira.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
