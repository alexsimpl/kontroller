package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.MessagesDto;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Kontroller;
import com.example.demo.Entity.Messages;
import com.example.demo.repository.KontrollerRepository;
import com.example.demo.repository.MessagesRepository;

public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    // private MessagesRepository messagesRepository;
    
    public List<MessagesDto> methodService(KontrollerDto kontrollerDto) {
	    Kontroller kontroller = new Kontroller();
	    kontroller.setType(kontrollerDto.getType());
	    kontroller.setSn(kontrollerDto.getSn());


        List<MessagesDto> listClass = kontrollerDto.getMessages()
            .map(this::getMessagesDto)
            .collect(Collectors.toList());

            kontroller.setMessages(listClass);
	//Сохранение в БД
	kontrollerRepository.save(kontroller);
    }

    public List<Kontroller> getAllKontrollers() {
        return kontrollerRepository.findAll();
    }

    // private Messages getMessagesDto (MessagesDto messagesDto) {
    //     Messages messages = new Messages();
    //     messages.setId(messagesDto.getId());
    //     messages.setOperation(messagesDto.getOperation());
    //     messages.setFw(messagesDto.getFw());
    //     messages.setActive(messagesDto.getActive());
    //     messages.setMode(messagesDto.getMode());
    //     messages.setControllerIp(messagesDto.getControllerIp());
    //     messages.setReaderProtocol(messagesDto.getReaderProtocol());

    //     return messages;
    // }

}
