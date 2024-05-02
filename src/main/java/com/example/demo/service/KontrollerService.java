package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.Entity.KontrollerEntity;
import com.example.demo.repository.KontrollerRepository;


@Service
public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    // private MessagesRepository messagesRepository;    
    
    public KontrollerEntity createKontrollerService(KontrollerDto kontrollerDto) {
	    // KontrollerDto kontrollerDto = new KontrollerDto();
	    // kontrollerDto.setType(kontrollerDto.getType());
	    // kontrollerDto.setSn(kontrollerDto.getSn());
        // List<MessagesDto> listClass = kontrollerDto.getMessages()
        //     .map(this::getMessagesDto)
        //     .collect(Collectors.toList());
        //     kontrollerDto.setMessages(listClass);

        KontrollerEntity kontrollerEntity = new KontrollerEntity();
        kontrollerEntity = KontrollerMapper.toEntity(kontrollerDto);
	    //Сохранение в БД
        kontrollerRepository.save(kontrollerEntity);
        return kontrollerEntity;

    }

    public List<KontrollerEntity> getAllKontrollers() {
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
