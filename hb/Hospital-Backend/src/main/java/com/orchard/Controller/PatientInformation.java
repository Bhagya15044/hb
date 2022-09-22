package com.orchard.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orchard.Entity.Patiententity;
import com.orchard.Exception.PatientNotFoundDetails;
import com.orchard.Service.HospitallService;

@RestController
@CrossOrigin
public class PatientInformation {

    @Autowired
    HospitallService service;

    @GetMapping("/patients/patient/{id}")
    public Patiententity DisplayPatientInformation(@PathVariable Integer id){
        Patiententity patient = service.DisplayPatientInformation1(id);
        if(patient == null){
            throw new PatientNotFoundDetails(id + " is not in database");
        }
        return patient;
    }

    @PostMapping("patients/patient")
    public boolean createPatient(@RequestBody Patiententity patient){
        service.savePatientInformation(patient);
        return true;
    }

}