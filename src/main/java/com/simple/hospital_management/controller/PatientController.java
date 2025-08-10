package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/patient/api")
public class PatientController {

    Map<Integer, Patient> patientMapDb = new HashMap<>();

    @PostMapping("/save")
    public String savePatient( @RequestBody Patient patient){

        patientMapDb.put(patient.getId(), patient);
        System.out.println("patient saved: "+patientMapDb);
        return "Patient saved successfully!";
    }
}
