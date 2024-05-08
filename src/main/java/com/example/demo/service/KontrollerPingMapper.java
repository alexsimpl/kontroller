package com.example.demo.service;

import java.util.stream.Collectors;

import com.example.demo.DTO.KontrollerPingDto;
import com.example.demo.DTO.MessagesPingDto;
import com.example.demo.Entity.KontrollerPingEntity;
import com.example.demo.Entity.MessagesPingEntity;


public class KontrollerPingMapper {

    public static KontrollerPingDto KontrollerPingtoDto(KontrollerPingEntity kontrollerPingEntity) {
        KontrollerPingDto kontrollerPingDto = new KontrollerPingDto();
        kontrollerPingDto.setId(kontrollerPingEntity.getId());
        kontrollerPingDto.setType(kontrollerPingEntity.getType());
        kontrollerPingDto.setSn(kontrollerPingEntity.getSn());
        kontrollerPingDto.setMessages(kontrollerPingEntity.getMessages().stream().map(KontrollerPingMapper::toDto).collect(Collectors.toList()));

        return kontrollerPingDto;
    }

    public static KontrollerPingEntity toEntity(KontrollerPingDto kontrollerPingDto) {
        KontrollerPingEntity kontrollerPingEntity = new KontrollerPingEntity();
        kontrollerPingEntity.setId(kontrollerPingDto.getId());
        kontrollerPingEntity.setType(kontrollerPingDto.getType());
        kontrollerPingEntity.setSn(kontrollerPingDto.getSn());
        kontrollerPingEntity.setMessages(kontrollerPingDto.getMessages().stream().map(KontrollerPingMapper::toEntity).collect(Collectors.toList()));
        return kontrollerPingEntity;
    }

    public static MessagesPingDto toDto(MessagesPingEntity messagesPingEntity) {
        MessagesPingDto messagesPingDto = new MessagesPingDto();
        messagesPingDto.setId(messagesPingEntity.getIdMessages());
        messagesPingDto.setOperation(messagesPingEntity.getOperation());
        messagesPingDto.setActive(messagesPingEntity.getActive());
        messagesPingDto.setMode(messagesPingEntity.getMode());
        return messagesPingDto;
    }

    public static MessagesPingEntity toEntity(MessagesPingDto messagesPingDto) {
        MessagesPingEntity messagesPingEntity = new MessagesPingEntity();
        messagesPingEntity.setIdMessages(messagesPingDto.getId());
        messagesPingEntity.setOperation(messagesPingDto.getOperation());
        messagesPingEntity.setActive(messagesPingDto.getActive());
        messagesPingEntity.setMode(messagesPingDto.getMode());
        return messagesPingEntity;
    }

}
