package com.example.demo.Entity;


// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages_answer")
public class MessagesAnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "idMessages")
    private long idMessages;

    @Column(name = "operation")
    private String operation;

    @Column(name = "fw")
    private String fw;

    @Column(name = "conn_fw")
    private String conn_fw;

    @Column(name = "active")
    private int active;

    @Column(name = "controller_ip")
    private String controller_ip;

    @Column(name = "reader_protocol")
    private String reader_protocol;

    @Column(name = "online")
    private int online;

    @Column(name = "events_success")
    private int events_success;

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private KontrollerAnswerEntity kontroller_answer;
}
