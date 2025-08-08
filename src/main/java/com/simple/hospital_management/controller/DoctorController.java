package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/api")

public class DoctorController {
    // Hashmap - using hashmap to sto re the data -in memory

    Map<Integer, Doctor> doctorMapDb = new HashMap<>();

    @PostMapping("/save")
    public String saveDoctor(Doctor doctor){
        doctorMapDb.put(doctor.getId(), doctor);
        System.out.println("doctor saved: "+doctorMapDb);
        return "Doctor saved successfully!";
    }
}