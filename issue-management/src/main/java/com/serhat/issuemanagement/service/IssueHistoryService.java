package com.serhat.issuemanagement.service;

import com.serhat.issuemanagement.dto.IssueHistoryDto;
import com.serhat.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);

}
