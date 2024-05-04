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
   
    
    //save kontroller in db
    public void createKontrollerService(KontrollerDto kontrollerDto) {
	    // KontrollerDto kontrollerDto = new KontrollerDto();
	    // kontrollerDto.setType(kontrollerDto.getType());
	    // kontrollerDto.setSn(kontrollerDto.getSn());
        // List<MessagesDto> listClass = kontrollerDto.getMessages()
        //     .map(this::getMessagesDto)
        //     .collect(Collectors.toList());
        //     kontrollerDto.setMessages(listClass);

        KontrollerEntity kontrollerEntity = new KontrollerEntity();
        kontrollerEntity = KontrollerMapper.toEntity(kontrollerDto);
        kontrollerRepository.save(kontrollerEntity);
        // return kontrollerEntity;

    }

    //get One kontroller by id
    public KontrollerEntity getOneKontrollerService(Long id) {
	    KontrollerEntity kontrollerEntity = kontrollerRepository.findById(id).get();
        return kontrollerEntity;
    }

//  public List<KontrollerEntity> getAllKontrollers() {
//     return kontrollerRepository.findAll();
//  }

    //get All kontrollers
    public List<KontrollerEntity> getAllKontrollerService() {
	    List<KontrollerEntity> kontrollerEntity = kontrollerRepository.findAll();
        return kontrollerEntity;
    }

}