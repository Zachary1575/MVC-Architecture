package com.example.Complaints.Complaint;

// Spring Dependencies
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class Complaint_Controller {

    private final Complaint_Service complaint_service;                          // Dependency Injection initialize the variable, this is essentially our service

    @Autowired      // Tells to autowire the parameters as a dependency injection once instantiated
    public Complaint_Controller (Complaint_Service complaint_service) {         // Dependency Injection site
        this.complaint_service = complaint_service;
        // We could do what is below, but it is not good practice, use @Autowire from spring library
        //this.complaint_service = new Complaint_Service();                      // The "new" allows us to create a Complain_Service instance when Controller is created
    }

    // Gets all complaints form the data base
    @GetMapping(path = "complaints")
    public List<Complaint> getComplaints() {
        return complaint_service.getComplaints();
    }



}
