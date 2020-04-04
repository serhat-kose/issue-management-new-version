package com.serhat.issuemanagement.service;

import com.serhat.issuemanagement.dto.ProjectDto;
import com.serhat.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by temelt on 4.02.2019.
 */
public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    List<ProjectDto> getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);
}
