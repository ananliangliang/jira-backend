package pers.ananliangliang.jira.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pers.ananliangliang.jira.dto.ProjectDTO;
import pers.ananliangliang.jira.service.ProjectService;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    @GetMapping("/{id}")
    public ProjectDTO getProject(@PathVariable Long id) {
        return service.getProject(id);
    }

    @GetMapping("")
    public List<ProjectDTO> getProjects(@RequestParam(required = false) Long personId, @RequestParam(required = false) String name) {
        return service.getProjects(personId, name);
    }

}
