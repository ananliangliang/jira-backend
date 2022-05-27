package pers.ananliangliang.jira.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private Long id;
    private String name;
    private Long personId;
    private String organization;
    private Long create;
}
