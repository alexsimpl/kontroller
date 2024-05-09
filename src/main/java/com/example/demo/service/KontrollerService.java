package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.Answer.KontrollerAnswerDto;
import com.example.demo.DTO.Answer.MessagesAnswerDto;
// import com.example.demo.Entity.KontrollerAnswerEntity;
import com.example.demo.Entity.KontrollerEntity;
import com.example.demo.Entity.Answer.KontrollerAnswerEntity;
import com.example.demo.Entity.Answer.MessagesAnswerEntity;
import com.example.demo.exception.KontrollerAlreadyExistException;
import com.example.demo.repository.KontrollerAnswerRepository;
// import com.example.demo.repository.EventsRepository;
import com.example.demo.repository.KontrollerRepository;
// import com.example.demo.repository.MessagesRepository;



@Service
public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    // private MessagesRepository messagesRepository;
    // private EventsRepository eventsRepository;
    private KontrollerAnswerRepository kontrollerAnswerRepository;
    
    //save kontroller in db
    public KontrollerEntity createKontrollerService(KontrollerDto kontrollerDto) throws KontrollerAlreadyExistException{

        if (kontrollerRepository.findBySn(kontrollerDto.getSn()) != null) {
            throw new KontrollerAlreadyExistException("Kontroller with sn this serial number already exists");
        } else {
            KontrollerEntity kontrollerEntity = new KontrollerEntity();
            kontrollerEntity = KontrollerMapper.toEntity(kontrollerDto);
            kontrollerRepository.save(kontrollerEntity);
            return kontrollerEntity;
        }
    }

    //response to kontroller 
    public KontrollerAnswerEntity responseToKontrollerService(KontrollerAnswerDto kontrollerAnswerDto) {
        //selecting an answer depending on the value "operation"
        List<MessagesAnswerDto> messages = kontrollerAnswerDto.getMessages();
        
        System.out.println("Size of list messages is " + messages.size());
        System.out.println("--------------------------------");
        // System.out.println("--------------"+!messages.get(0).getOperation().isEmpty());
        System.out.println("--------------------------------");

        if (messages.size() == 1 && !messages.get(0).getOperation().isEmpty()) {
            System.out.println("Operation in 0 elements");
            
        switch (messages.get(0).getOperation()) {
            
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
                System.out.println("operation is " + messages.get(0).getOperation());
                KontrollerAnswerEntity kontrollerAnswerPowerOnEntity = new KontrollerAnswerEntity();
                kontrollerAnswerPowerOnEntity = KontrollerAnswerMapper.toEntity(kontrollerAnswerDto);
                kontrollerAnswerPowerOnEntity.setDate("1234");
                kontrollerAnswerPowerOnEntity.setInterval(10);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setId(kontrollerAnswerPowerOnEntity.getMessages().get(0).getIdMessages());
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setIdMessages(0);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setOperation("set_active");
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setFw(null);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setActive(1);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setController_ip(null);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setReader_protocol(null);
                kontrollerAnswerPowerOnEntity.getMessages().get(0).setOnline(0);
                return kontrollerAnswerPowerOnEntity;
               
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
                System.out.println("operation is " + messages.get(0).getOperation());
                KontrollerAnswerEntity kontrollerAnswerPingEntity = new KontrollerAnswerEntity();
                kontrollerAnswerPingEntity = KontrollerAnswerMapper.toEntity(kontrollerAnswerDto);
                // kontrollerAnswerEntity.setId(kontrollerAnswerDto.getId());
                // kontrollerAnswerEntity.setId(kontrollerAnswerDto.getMessages().get(0).getId());
                
                kontrollerAnswerPingEntity.setDate("123456");
                kontrollerAnswerPingEntity.setInterval(10);
                List<MessagesAnswerEntity> emptyList = new ArrayList<>();
                kontrollerAnswerPingEntity.setMessages(emptyList);
                kontrollerAnswerRepository.save(kontrollerAnswerPingEntity);
                return kontrollerAnswerPingEntity;

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
                System.out.println("operation is " + messages.get(0).getOperation());
                KontrollerAnswerEntity kontrollerAnswerEventsEntity = new KontrollerAnswerEntity();
                kontrollerAnswerEventsEntity = KontrollerAnswerMapper.toEntity(kontrollerAnswerDto);
                kontrollerAnswerEventsEntity.setDate("123456");
                kontrollerAnswerEventsEntity.setInterval(10);
                kontrollerAnswerEventsEntity.getMessages().get(0).setId(kontrollerAnswerDto.getMessages().get(0).getId());
                kontrollerAnswerEventsEntity.getMessages().get(0).setIdMessages(0);
                kontrollerAnswerEventsEntity.getMessages().get(0).setOperation("events");
                kontrollerAnswerEventsEntity.getMessages().get(0).setEvents_success(10);
                // kontrollerAnswerRepository.save(kontrollerAnswerEventsEntity);
                
                return kontrollerAnswerEventsEntity;
        
            default:
                KontrollerAnswerEntity kontrollerAnswerEntity = new KontrollerAnswerEntity();
                kontrollerAnswerRepository.save(kontrollerAnswerEntity);
                return kontrollerAnswerEntity;
        } 
        } else
        if (!messages.get(1).getOperation().isEmpty()){
            System.out.println("Operation in 1 elements");
            switch (messages.get(1).getOperation()) {

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
                    System.out.println("operation is " + messages.get(0).getOperation());
                    // kontrollerAnswerPingEntity = KontrollerAnswerMapper.toEntity(kontrollerAnswerDto);
                    
                    // kontrollerAnswerEntity.setId(kontrollerAnswerDto.getId());
                    KontrollerAnswerEntity kontrollerAnswerEntity = new KontrollerAnswerEntity();                
                    kontrollerAnswerEntity.setID(kontrollerAnswerDto.getMessages().get(0).getId());
                    kontrollerAnswerEntity.setDate("123456");
                    kontrollerAnswerEntity.setInterval(10);
                    List<MessagesAnswerEntity> emptyList = new ArrayList<>();
                    kontrollerAnswerEntity.setMessages(emptyList);
                    return kontrollerAnswerEntity;

                // case "events":
                //     //response events
                //     // { 
                //     //     "date": date_answer,
                //     //     "interval": 10,
                //     //     "messages":
                //     //     [
                //     //         {
                //     //             "id": id,
                //     //             "operation": "events",
                //     //             "events_success": 10
                //     //         }
                //     //     ]
                //     // }
                //     System.out.println("operation is " + messages.get(0).getOperation());
                //     KontrollerAnswerEntity kontrollerAnswerEventsEntity = new KontrollerAnswerEntity();
                //     kontrollerAnswerEventsEntity.setDate("123456");
                //     kontrollerAnswerEventsEntity.setInterval(10);
                //     kontrollerAnswerEventsEntity.getMessages().get(0).setId(kontrollerAnswerEventsEntity.getMessages().get(0).getIdMessages());
                //     kontrollerAnswerEventsEntity.getMessages().get(0).setOperation("events");
                //     kontrollerAnswerEventsEntity.getMessages().get(0).setEvents_success(10);

                    
                //     return kontrollerAnswerEventsEntity;
            
                default:
                    KontrollerAnswerEntity kontrollerAnswerDefaultEntity = new KontrollerAnswerEntity();
                    return kontrollerAnswerDefaultEntity;
            }
        } else {
            KontrollerAnswerEntity kontrollerAnswerEntity = new KontrollerAnswerEntity();
            return kontrollerAnswerEntity;
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