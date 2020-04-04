package com.serhat.issuemanagement.repository;

import com.serhat.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueRepository extends JpaRepository<Issue, Long> {

}
