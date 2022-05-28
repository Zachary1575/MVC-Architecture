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


    // ID **
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // **


    // DESCRIPTION ***
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ***


    // PRIORITY ****
    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    // ****


    // DATE *****
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // *****
}
