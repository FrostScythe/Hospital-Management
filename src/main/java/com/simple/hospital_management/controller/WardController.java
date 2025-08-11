package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Doctor;
import com.simple.hospital_management.model.Ward;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ward/api")
public class WardController {

    Map<Integer, Ward> wardMapDb = new HashMap<>();

    @PostMapping("/save")
    public String saveWard( @RequestBody Ward ward){

        wardMapDb.put(ward.getId(), ward);
        System.out.println("ward saved: "+wardMapDb);
        return "Ward saved successfully!";
    }

    @GetMapping("/find/{id}")
    public Ward getWardById(@PathVariable int id){
        return wardMapDb.get(id);
    }

    @GetMapping("/findAll")
    public Map<Integer, Ward> getAllWards(){
        return wardMapDb;
    }

    @DeleteMapping("/find/{id}")
    public String deleteWardById(@PathVariable int id){
        wardMapDb.remove(id);
        return " Ward removed successfully";
    }
}
