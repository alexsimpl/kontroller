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
@Table(name = "kontroller")
public class Kontroller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "sn")
    private String sn;

    @Column(name = "messages")
    private List<MessagesDto> messages;

}
