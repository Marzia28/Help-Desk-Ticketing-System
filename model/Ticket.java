package com.helpdesk.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String priority;
    private String category;
    private LocalDate creationDate;

    // Getters and Setters
}