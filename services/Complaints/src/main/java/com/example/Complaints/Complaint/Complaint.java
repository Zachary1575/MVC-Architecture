package com.example.Complaints.Complaint;

import java.time.LocalDate;

public class Complaint {

    // Our Object attributes
    private int id;
    private String description;
    private Boolean priority;
    private LocalDate date;

    public Complaint () { }         // Default Constructor

    public Complaint (int id, String description, Boolean priority, LocalDate date)         // Selective Constructor
    {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.date = date;
    }



}
