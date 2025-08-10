package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/api")

public class DoctorController {
    // Hashmap - using hashmap to sto re the data -in memory

    Map<Integer, Doctor> doctorMapDb = new HashMap<>();

    // debugging - tracing the flow of application (understanding line by line what is happening )
    //@RequestBody only work with complete class object input

    @PostMapping("/save")
    public String saveDoctor( @RequestBody Doctor doctor){

        doctorMapDb.put(doctor.getId(), doctor);
        System.out.println("doctor saved: "+doctorMapDb);
        return "Doctor saved successfully!";
    }

    //@PathVariable - it takes the input in the url path and endpoint

    @GetMapping("/find/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        return doctorMapDb.get(id);
    }

    @GetMapping("/findAll")
    public Map<Integer, Doctor> getAllDoctors(){
        return doctorMapDb;
    }

    @DeleteMapping("/find/{id}")
    public String deleteDoctorById(@PathVariable int id){
        doctorMapDb.remove(id);
        return " Doctor removed successfully";
    }
}