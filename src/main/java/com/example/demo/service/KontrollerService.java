package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.MessagesDto;
import com.example.demo.Entity.Employee;
import com.example.demo.repository.KontrollerRepository;

public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    
    public methodService(KontrollerDto kontrollerDto) {
        List<MessagesDto> listClass = kontrollerDto.messages()
            .map(this::getMessagesDto)
            .collect(Collectors.toList());
	//Сохранение в БД
	kontrollerRepository.save();

    }
    private Messages getMessagesDto (MessagesDto employeesDto) {
        Employee employees = new Employee();
        employee.setFirstName(employeesDto.getFirstName());
        employee.setLastName(employeesDto.getLastName());
        employee.setEmailId(employeesDto.getEmailId());

        return employees;
    }

}
