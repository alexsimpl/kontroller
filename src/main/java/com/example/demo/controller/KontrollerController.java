package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.KontrollerAnswerDto;
import com.example.demo.DTO.KontrollerDto;
import com.example.demo.exception.KontrollerAlreadyExistException;
import com.example.demo.service.KontrollerService;

@RestController
@RequestMapping("/api/v1/")
public class KontrollerController {

    @Autowired
    private KontrollerService kontrollerService;

    // get all kontrollers for external client
    @GetMapping("/kontrollers")
    public ResponseEntity<?> getAllKontrollers() {
        return ResponseEntity.ok(kontrollerService.getAllKontrollerService());
    }

    //get one kontrollers by id for external client
    @GetMapping("/kontrollers/{id}")

    public ResponseEntity<?> getOneKontroller(@RequestParam Long id) {
        return ResponseEntity.ok(kontrollerService.getOneKontrollerService(id));
    }


    // create kontrollers by id rest api
    @PostMapping("/kontrollers")
	public void createKontroller(@RequestBody KontrollerDto kontrollerDto) throws KontrollerAlreadyExistException{
        kontrollerService.createKontrollerService(kontrollerDto);
	}

    //response to kontroller for Postman
    @PostMapping("/kontroller")
    public ResponseEntity<?> responseToKontroller(@RequestBody KontrollerAnswerDto kontrollerAnswerDto) {
        return ResponseEntity.ok(kontrollerService.responseToKontrollerService(kontrollerAnswerDto));
    }
   
}
