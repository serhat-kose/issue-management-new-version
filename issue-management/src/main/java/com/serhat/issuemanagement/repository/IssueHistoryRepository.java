package com.serhat.issuemanagement.repository;

import com.serhat.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

}
