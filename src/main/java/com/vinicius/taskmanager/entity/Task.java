package com.vinicius.taskmanager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;

    private String status;

    private String priority;
}