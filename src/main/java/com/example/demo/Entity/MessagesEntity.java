package com.example.demo.Entity;

import java.util.List;

// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class MessagesEntity {

    @ManyToOne
    @JoinColumn(name = "kontroller_id")
    private KontrollerEntity kontroller;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "operation")
    private String operation;

    @Column(name = "fw")
    private String fw;

    @Column(name = "active")
    private String active;

    @Column(name = "mode")
    private String mode;

    @Column(name = "controllerIp")
    private String controllerIp;

    @Column(name = "readerProtocol")
    private String readerProtocol;

    @Column(name = "events")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "messages")
    private List<EventsEntity> events;
}
