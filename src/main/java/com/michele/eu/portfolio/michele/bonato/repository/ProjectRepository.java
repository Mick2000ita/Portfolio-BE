package com.michele.eu.portfolio.michele.bonato.repository;

import com.michele.eu.portfolio.michele.bonato.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}