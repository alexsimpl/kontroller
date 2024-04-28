package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Kontroller;
import com.example.demo.repository.KontrollerRepository;

// @CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class KontrollerController {

    @Autowired
    private KontrollerRepository kontrollerRepository;

    // get all kontrollers
    @GetMapping("/kontrollers")
    public List<Kontroller> getAllKontrollers() {
        return kontrollerRepository.findAll();
    }

    // create kontrollers by id rest api
    @PostMapping("/kontrollers")
	public Kontroller createKontroller(@RequestBody Kontroller kontroller) {

		// return kontrollerRepository.save(kontroller);
        return kontroller;
	}

   
}
