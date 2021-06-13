package pers.ananliangliang.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pers.ananliangliang.jira.entity.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByUserIdAndName(Long userId, String name);

    List<Project> findByUserId(Long userId);

    List<Project> findByName(String name);
}
