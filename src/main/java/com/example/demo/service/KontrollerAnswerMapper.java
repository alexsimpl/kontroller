package com.example.demo.service;

import java.util.stream.Collectors;

import com.example.demo.DTO.Answer.KontrollerAnswerDto;
import com.example.demo.DTO.Answer.MessagesAnswerDto;
import com.example.demo.Entity.Answer.KontrollerAnswerEntity;
import com.example.demo.Entity.Answer.MessagesAnswerEntity;

public class KontrollerAnswerMapper {

    public static KontrollerAnswerDto KontrollerAnswertoDto(KontrollerAnswerEntity kontrollerAnswerEntity) {
        KontrollerAnswerDto kontrollerAnswerDto = new KontrollerAnswerDto();
        kontrollerAnswerDto.setId(kontrollerAnswerEntity.getID());
        kontrollerAnswerDto.setMessages(kontrollerAnswerEntity.getMessages().stream().map(KontrollerAnswerMapper::toDto).collect(Collectors.toList()));

        return kontrollerAnswerDto;
    }

    public static KontrollerAnswerEntity toEntity(KontrollerAnswerDto kontrollerAnswerDto) {
        KontrollerAnswerEntity kontrollerAnswerEntity = new KontrollerAnswerEntity();
        kontrollerAnswerEntity.setID(kontrollerAnswerDto.getId());
        kontrollerAnswerEntity.setMessages(kontrollerAnswerDto.getMessages().stream().map(KontrollerAnswerMapper::toEntity).collect(Collectors.toList()));
        return kontrollerAnswerEntity;
    }

    public static MessagesAnswerDto toDto(MessagesAnswerEntity messagesAnswerEntity) {
        MessagesAnswerDto messagesAnswerDto = new MessagesAnswerDto();
        messagesAnswerDto.setId(messagesAnswerEntity.getIdMessages());
        messagesAnswerDto.setOperation(messagesAnswerEntity.getOperation());
        messagesAnswerDto.setActive(messagesAnswerEntity.getActive());
        messagesAnswerDto.setOnline(messagesAnswerEntity.getOnline());
        messagesAnswerDto.setController_ip(messagesAnswerEntity.getController_ip());
        messagesAnswerDto.setFw(messagesAnswerEntity.getFw());
        messagesAnswerDto.setReader_protocol(messagesAnswerEntity.getReader_protocol());
        return messagesAnswerDto;
    }

    public static MessagesAnswerEntity toEntity(MessagesAnswerDto messagesAnswerDto) {
        MessagesAnswerEntity messagesAnswerEntity = new MessagesAnswerEntity();
        messagesAnswerEntity.setIdMessages(messagesAnswerDto.getId());
        messagesAnswerEntity.setOperation(messagesAnswerDto.getOperation());
        messagesAnswerEntity.setActive(messagesAnswerDto.getActive());
        messagesAnswerEntity.setOnline(messagesAnswerDto.getOnline());
        messagesAnswerEntity.setController_ip(messagesAnswerDto.getController_ip());
        messagesAnswerEntity.setFw(messagesAnswerDto.getFw());
        messagesAnswerEntity.setReader_protocol(messagesAnswerDto.getReader_protocol());
        return messagesAnswerEntity;
    }

}
