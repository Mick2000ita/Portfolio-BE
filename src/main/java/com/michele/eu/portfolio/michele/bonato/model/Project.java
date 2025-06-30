package com.michele.eu.portfolio.michele.bonato.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROJECT_ID")
    private Long id;

    @Column(name = "PROJECT_START_TIME")
    private LocalDateTime startTime;

    @Column(name = "PROJECT_END_TIME")
    private LocalDateTime endTime;

    @Column(name = "PROJECT_NAME")
    private String name;

    @Column(name = "TECHNOLOGY")
    private String technology;

    // Empty constructor JPA
    public Project() {}

    // Constructor
    public Project(LocalDateTime startTime, LocalDateTime endTime, String name, String technology) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.technology = technology;
    }

    // Getter & Setter
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public LocalDateTime getStartTime() { return startTime; }

    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }

    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTechnology() { return technology; }

    public void setTechnology(String technology) { this.technology = technology; }
}