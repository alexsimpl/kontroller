package com.example.demo.service;

import java.util.stream.Collectors;

import com.example.demo.DTO.PowerOn.KontrollerPowerOnDto;
import com.example.demo.DTO.PowerOn.MessagesPowerOnDto;
import com.example.demo.Entity.PowerOn.KontrollerPowerOnEntity;
import com.example.demo.Entity.PowerOn.MessagesPowerOnEntity;


public class KontrollerPowerOnMapper {

    public static KontrollerPowerOnDto KontrollerPowerOntoDto(KontrollerPowerOnEntity kontrollerPowerOnEntity) {
        KontrollerPowerOnDto kontrollerPowerOnDto = new KontrollerPowerOnDto();
        kontrollerPowerOnDto.setId(kontrollerPowerOnEntity.getID());
        kontrollerPowerOnDto.setMessages(kontrollerPowerOnEntity.getMessages().stream().map(KontrollerPowerOnMapper::toDto).collect(Collectors.toList()));

        return kontrollerPowerOnDto;
    }

    public static KontrollerPowerOnEntity toEntity(KontrollerPowerOnDto kontrollerPowerOnDto) {
        KontrollerPowerOnEntity kontrollerPowerOnEntity = new KontrollerPowerOnEntity();
        kontrollerPowerOnEntity.setID(kontrollerPowerOnDto.getId());
        kontrollerPowerOnEntity.setMessages(kontrollerPowerOnDto.getMessages().stream().map(KontrollerPowerOnMapper::toEntity).collect(Collectors.toList()));
        return kontrollerPowerOnEntity;
    }

    public static MessagesPowerOnDto toDto(MessagesPowerOnEntity messagesPowerOnEntity) {
        MessagesPowerOnDto messagesPowerOnDto = new MessagesPowerOnDto();
        messagesPowerOnDto.setId(messagesPowerOnEntity.getIdMessages());
        messagesPowerOnDto.setOperation(messagesPowerOnEntity.getOperation());
        messagesPowerOnDto.setActive(messagesPowerOnEntity.getActive());
        messagesPowerOnDto.setMode(messagesPowerOnEntity.getMode());
        messagesPowerOnDto.setController_ip(messagesPowerOnEntity.getController_ip());
        messagesPowerOnDto.setFw(messagesPowerOnEntity.getFw());
        messagesPowerOnDto.setReader_protocol(messagesPowerOnEntity.getReader_protocol());
        return messagesPowerOnDto;
    }

    public static MessagesPowerOnEntity toEntity(MessagesPowerOnDto messagesPowerOnDto) {
        MessagesPowerOnEntity messagesPowerOnEntity = new MessagesPowerOnEntity();
        messagesPowerOnEntity.setIdMessages(messagesPowerOnDto.getId());
        messagesPowerOnEntity.setOperation(messagesPowerOnDto.getOperation());
        messagesPowerOnEntity.setActive(messagesPowerOnDto.getActive());
        messagesPowerOnEntity.setMode(messagesPowerOnDto.getMode());
        messagesPowerOnEntity.setController_ip(messagesPowerOnDto.getController_ip());
        messagesPowerOnEntity.setFw(messagesPowerOnDto.getFw());
        messagesPowerOnEntity.setReader_protocol(messagesPowerOnDto.getReader_protocol());
        return messagesPowerOnEntity;
    }

}
