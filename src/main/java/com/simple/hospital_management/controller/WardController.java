package com.simple.hospital_management.controller;

import com.simple.hospital_management.model.Ward;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
