package com.example.demo.Entity;

import java.util.List;

// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "kontroller")
public class KontrollerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "sn")
    private String sn;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "messagesKontroller")
    @Column(name = "messagesKontroller_id")
    private List<MessagesEntity> messages;
    
    // @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventsKontroller")
    // @Column(name = "eventsKontroller_id")
    // private List<EventsEntity> events;

}
