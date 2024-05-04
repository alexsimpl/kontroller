package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.service.KontrollerService;

// @CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class KontrollerController {

    @Autowired
    private KontrollerService kontrollerService;

    // get all kontrollers
    @GetMapping("/kontrollers")
    public ResponseEntity<?> getAllKontrollers() {
        return ResponseEntity.ok(kontrollerService.getAllKontrollerService());
    }

    //get one kontrollers by id
    @GetMapping("/kontrollers/{id}")

    public ResponseEntity<?> getOneKontroller(@RequestParam Long id) {
        return ResponseEntity.ok(kontrollerService.getOneKontrollerService(id));
    }


    // create kontrollers by id rest api
    @PostMapping("/kontrollers")
	public void createKontroller(@RequestBody KontrollerDto kontrollerDto) {
        kontrollerService.createKontrollerService(kontrollerDto);
	}
   
}
