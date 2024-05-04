package com.example.demo.Entity;

import java.util.List;

// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages")
public class MessagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "idMessages")
    private long idMessages;

    @Column(name = "operation")
    private String operation;

    @Column(name = "fw")
    private String fw;

    @Column(name = "active")
    private int active;

    @Column(name = "mode")
    private int mode;

    @Column(name = "controllerIp")
    private String controllerIp;

    @Column(name = "readerProtocol")
    private String readerProtocol;

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private KontrollerEntity kontroller;

    @Column(name = "events")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "messages")
    private List<EventsEntity> events;
}
