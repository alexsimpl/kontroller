package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.MessagesDto;
import com.example.demo.Entity.KontrollerEntity;
import com.example.demo.exception.KontrollerAlreadyExistException;
import com.example.demo.repository.EventsRepository;
import com.example.demo.repository.KontrollerRepository;
import com.example.demo.repository.MessagesRepository;

import io.micrometer.core.ipc.http.HttpSender.Response;


@Service
public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    // private MessagesRepository messagesRepository;
    // private EventsRepository eventsRepository;
    
    //save kontroller in db
    public void createKontrollerService(KontrollerDto kontrollerDto) throws KontrollerAlreadyExistException{
	    // KontrollerDto kontrollerDto = new KontrollerDto();
	    // kontrollerDto.setType(kontrollerDto.getType());
	    // kontrollerDto.setSn(kontrollerDto.getSn());
        // List<MessagesDto> listClass = kontrollerDto.getMessages()
        //     .map(this::getMessagesDto)
        //     .collect(Collectors.toList());
        //     kontrollerDto.setMessages(listClass);

        if (kontrollerRepository.findBySn(kontrollerDto.getSn()) != null) {
            throw new KontrollerAlreadyExistException("Kontroller with sn this serial number already exists");
        } else {
            KontrollerEntity kontrollerEntity = new KontrollerEntity();
            kontrollerEntity = KontrollerMapper.toEntity(kontrollerDto);
            kontrollerRepository.save(kontrollerEntity);
            // return kontrollerEntity;
        }
        // /* 
        
        // */
    }

    //response to kontroller 
    public KontrollerEntity responseToKontrollerService(KontrollerDto kontrollerDto) {
        //selecting an answer depending on the value "operation"
        List<MessagesDto> messages = kontrollerDto.getMessages();
        String operation = messages.get(0).getOperation();
        KontrollerEntity kontrollerEntity = new KontrollerEntity();

        switch (operation) {
            case "power_on":
                //response power_on
            // { 
            //     "date": date_answer,
            //     "interval": 10,
            //     "messages":
            //     [
            //         {
            //             "id": id,
            //             "operation": "set_active",
            //             "active": 1,
            //             "online": 0
            //         }
            //     ]
            // }
            // kontrollerEntity.setMessages();
                System.out.println("operation is " + operation);
                System.out.println("events flag is " + messages.get(0).getEvents().get(0).getCard());
                return kontrollerEntity;
                // return ({
                //     "date": date_answer,
                //     "interval": 10,
                //     "messages":
                //     [
                //     {
                //         "id": id,
                //         "operation": "set_active",
                //         "active": 1,
                //         "online": 0
                //     }
                //     ]
                // })

            case "ping":
             //response ping
                    //   { 
                    //     "date": date_answer,
                    //     "interval": 10,
                    //     "messages":
                    //     [
                    //     ]
                    // }
                // res.send
                System.out.println("operation is " + operation);
                return kontrollerEntity;

            case "events":
             //response events
            // { 
            //     "date": date_answer,
            //     "interval": 10,
            //     "messages":
            //     [
            //         {
            //             "id": id,
            //             "operation": "events",
            //             "events_success": 10
            //         }
            //     ]
            // }
                System.out.println("operation is " + operation);
                return kontrollerEntity;
        
            default:
                return kontrollerEntity;
        }
    }

    //get One kontroller by id
    public KontrollerEntity getOneKontrollerService(Long id) {
	    KontrollerEntity kontrollerEntity = kontrollerRepository.findById(id).get();
        return kontrollerEntity;
    }

    public List<KontrollerEntity> getAllKontrollers() {
        return kontrollerRepository.findAll();
    }

    //get All kontrollers
    public List<KontrollerEntity> getAllKontrollerService() {
	    List<KontrollerEntity> kontrollerEntity = kontrollerRepository.findAll();
        return kontrollerEntity;
    }

}