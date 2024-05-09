package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.KontrollerAnswerDto;
import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.MessagesAnswerDto;
import com.example.demo.Entity.KontrollerAnswerEntity;
// import com.example.demo.Entity.KontrollerAnswerEntity;
import com.example.demo.Entity.KontrollerEntity;
import com.example.demo.Entity.MessagesAnswerEntity;
import com.example.demo.exception.KontrollerAlreadyExistException;
// import com.example.demo.repository.EventsRepository;
// import com.example.demo.repository.EventsRepository;
import com.example.demo.repository.KontrollerRepository;
// import com.example.demo.repository.MessagesRepository;
// import com.example.demo.repository.MessagesRepository;



@Service
public class KontrollerService {

     @Autowired
    private KontrollerRepository kontrollerRepository;
    // private MessagesRepository messagesRepository;
    // private EventsRepository eventsRepository;
    
    //save kontroller in db
    public void createKontrollerService(KontrollerDto kontrollerDto) throws KontrollerAlreadyExistException{

        if (kontrollerRepository.findBySn(kontrollerDto.getSn()) != null) {
            throw new KontrollerAlreadyExistException("Kontroller with sn this serial number already exists");
        } else {
            KontrollerEntity kontrollerEntity = new KontrollerEntity();
            kontrollerEntity = KontrollerMapper.toEntity(kontrollerDto);
            kontrollerRepository.save(kontrollerEntity);
            // return kontrollerEntity;
        }
    }

    //get One kontroller by id
    public KontrollerEntity getOneKontrollerService(Long id) {
	    KontrollerEntity kontrollerEntity = kontrollerRepository.findById(id).get();
        return kontrollerEntity;
    }

    // public List<KontrollerEntity> getAllKontrollers() {
    //     return kontrollerRepository.findAll();
    // }

    //get All kontrollers
    public List<KontrollerEntity> getAllKontrollerService() {
	    List<KontrollerEntity> kontrollerEntity = kontrollerRepository.findAll();
        return kontrollerEntity;
    }

    //response to kontroller 
    public KontrollerAnswerEntity responseToKontrollerService(KontrollerAnswerDto kontrollerAnswerDto) {
        //selecting an answer depending on the value "operation"
        List<MessagesAnswerDto> messages = kontrollerAnswerDto.getMessages();
        // String operation = messages.get(0).getOperation();
        // String operation1 = messages.get(1).getOperation();
        // String operation1 = messages.get(0).getOperation();
        // KontrollerAnswerPingEntity kontrollerAnswerPingEntity = new KontrollerAnswerPingEntity();
        KontrollerAnswerEntity kontrollerAnswerEntity = new KontrollerAnswerEntity();
        System.out.println("Size of list messages is " + messages.size());
        
        if (!messages.get(0).getOperation().isEmpty()) {
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
                kontrollerAnswerEntity = KontrollerAnswerMapper.toEntity(kontrollerAnswerDto);

                kontrollerAnswerEntity.setDate("1234");
                kontrollerAnswerEntity.setInterval(10);
                kontrollerAnswerEntity.getMessages().get(0).setId(kontrollerAnswerEntity.getMessages().get(0).getIdMessages());
                kontrollerAnswerEntity.getMessages().get(0).setIdMessages(0);
                kontrollerAnswerEntity.getMessages().get(0).setOperation("set_active");
                kontrollerAnswerEntity.getMessages().get(0).setFw(null);
                kontrollerAnswerEntity.getMessages().get(0).setActive(1);
                kontrollerAnswerEntity.getMessages().get(0).setController_ip(null);
                kontrollerAnswerEntity.getMessages().get(0).setReader_protocol(null);
                kontrollerAnswerEntity.getMessages().get(0).setOnline(0);
                return kontrollerAnswerEntity;
               
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

                // kontrollerAnswerEntity.setId(kontrollerAnswerDto.getMessages().get(0).getId());
                kontrollerAnswerEntity.setDate("123456");
                kontrollerAnswerEntity.setInterval(10);
                List<MessagesAnswerEntity> emptyList = new ArrayList<>();
                kontrollerAnswerEntity.setMessages(emptyList);
                return kontrollerAnswerEntity;

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
                
                return kontrollerAnswerEntity;
        
            default:
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
    
                    kontrollerAnswerEntity.setId(kontrollerAnswerDto.getMessages().get(0).getId());
                    kontrollerAnswerEntity.setDate("123456");
                    kontrollerAnswerEntity.setInterval(10);
                    List<MessagesAnswerEntity> emptyList = new ArrayList<>();
                    kontrollerAnswerEntity.setMessages(emptyList);
                    return kontrollerAnswerEntity;

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
                        
                    return kontrollerAnswerEntity;
            
                default:
                    return kontrollerAnswerEntity;
            }
        } else {
            return kontrollerAnswerEntity;
        }
    }

}