package pers.ananliangliang.jira.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pers.ananliangliang.jira.dto.ProjectDTO;
import pers.ananliangliang.jira.entity.Project;
import pers.ananliangliang.jira.repository.ProjectRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectDTO getProject(Long id) {
        final var project = repository.findById(id).orElseThrow(() -> new RuntimeException("该id不存在"));

        return ProjectDTO.builder()
                .id(project.getId())
                .name(project.getName())
                .personId(project.getUserId())
                .organization(project.getOrganization())
                .create(project.getCreateTime().getTime())
                .build();
    }

    public List<ProjectDTO> getProjects(Long personId, String name) {
        final List<Project> projects;
        if (personId == null && name == null)
            projects = repository.findAll();
        else if (personId == null)
            projects = repository.findByName(name);
        else if (name == null)
            projects = repository.findByUserId(personId);
        else
            projects = repository.findByUserIdAndName(personId, name);

        return projects.stream()
                .map(project -> ProjectDTO.builder()
                        .id(project.getId())
                        .name(project.getName())
                        .organization(project.getOrganization())
                        .personId(project.getUserId())
                        .create(project.getCreateTime().getTime())
                        .build())
                .collect(Collectors.toList());
    }
}
