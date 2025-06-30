package com.michele.eu.portfolio.michele.bonato.controller;

import com.michele.eu.portfolio.michele.bonato.model.Project;
import com.michele.eu.portfolio.michele.bonato.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:4200") // consente richieste da Angular in locale
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // GET tutti i progetti
    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // POST per creare un progetto
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    // GET progetto singolo
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    // PUT per aggiornare un progetto
    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project updated) {
        return projectRepository.findById(id)
                .map(p -> {
                    p.setName(updated.getName());
                    p.setStartTime(updated.getStartTime());
                    p.setEndTime(updated.getEndTime());
                    p.setTechnology(updated.getTechnology());
                    return projectRepository.save(p);
                }).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}