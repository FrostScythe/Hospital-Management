package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Doctor;
import com.simple.hospital_management.model.Patient;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find/{id}")
    public Patient getPatientById(@PathVariable int id){
        return patientMapDb.get(id);
    }

    @GetMapping("/findAll")
    public Map<Integer, Patient> getAllPatients(){
        return patientMapDb;
    }

    @DeleteMapping("/find/{id}")
    public String deletePatientById(@PathVariable int id){
        patientMapDb.remove(id);
        return " Patient removed successfully";
    }
}
