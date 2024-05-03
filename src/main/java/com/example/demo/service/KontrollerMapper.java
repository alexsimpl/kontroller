package com.example.demo.service;

import java.util.stream.Collectors;

import com.example.demo.DTO.EventsDto;
import com.example.demo.DTO.KontrollerDto;
import com.example.demo.DTO.MessagesDto;
import com.example.demo.Entity.EventsEntity;
import com.example.demo.Entity.KontrollerEntity;
import com.example.demo.Entity.MessagesEntity;

public class KontrollerMapper {

    public static KontrollerDto toDto(KontrollerEntity kontrollerEntity) {
        KontrollerDto kontrollerDto = new KontrollerDto();
        kontrollerDto.setId(kontrollerEntity.getId());
        kontrollerDto.setType(kontrollerEntity.getType());
        kontrollerDto.setSn(kontrollerEntity.getSn());
        kontrollerDto.setMessages(kontrollerEntity.getMessages().stream().map(KontrollerMapper::toDto).collect(Collectors.toList()));
        return kontrollerDto;
    }

    public static KontrollerEntity toEntity(KontrollerDto kontrollerDto) {
        KontrollerEntity kontrollerEntity = new KontrollerEntity();
        kontrollerEntity.setId(kontrollerDto.getId());
        kontrollerEntity.setType(kontrollerDto.getType());
        kontrollerEntity.setSn(kontrollerDto.getSn());
        kontrollerEntity.setMessages(kontrollerDto.getMessages().stream().map(KontrollerMapper::toEntity).collect(Collectors.toList()));
        return kontrollerEntity;
    }

    public static MessagesDto toDto(MessagesEntity messagesEntity) {
        MessagesDto messagesDto = new MessagesDto();
        messagesDto.setId(messagesEntity.getIdMessages());
        messagesDto.setOperation(messagesEntity.getOperation());
        return messagesDto;
    }

    public static MessagesEntity toEntity(MessagesDto messagesDto) {
        MessagesEntity messagesEntity = new MessagesEntity();
        messagesEntity.setIdMessages(messagesDto.getId());
        messagesEntity.setOperation(messagesDto.getOperation());
        return messagesEntity;
    }

    public static EventsDto toDto(EventsEntity eventsEntity) {
        EventsDto eventsDto = new EventsDto();
        eventsDto.setId(eventsEntity.getId());
        eventsDto.setFlag(eventsEntity.getFlag());
        eventsDto.setEvent(eventsEntity.getEvent());
        return eventsDto;
    }

    public static EventsEntity toEntity(EventsDto eventsDto) {
        EventsEntity eventsEntity = new EventsEntity();
        eventsEntity.setId(eventsDto.getId());
        eventsEntity.setFlag(eventsDto.getFlag());
        eventsEntity.setEvent(eventsDto.getEvent());
        return eventsEntity;
    }

}
