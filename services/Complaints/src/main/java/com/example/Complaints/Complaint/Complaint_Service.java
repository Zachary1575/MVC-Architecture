package com.example.Complaints.Complaint;


import org.springframework.stereotype.Service;

import java.util.List;

// Service layer is where all the business logic occurs
@Service        // Service == Component
public class Complaint_Service {

    // Actually gets the complaints after being referenced by Complaint_Controller
    public List<Complaint> getComplaints() {
        return List.of();
    }
}
