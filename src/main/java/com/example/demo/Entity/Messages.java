package com.example.demo.Entity;

import java.util.List;

import com.example.demo.DTO.MessagesDto;

// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "operation")
    private String operation;

    @Column(name = "fw")
    private String fW;

    @Column(name = "mode")
    private String mode;

    @Column(name = "controllerIp")
    private String controllerIp;

    @Column(name = "readerProtocol")
    private String readerProtocol;
    
}
