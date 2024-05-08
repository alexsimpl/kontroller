package com.example.demo.Entity.Ping;


// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages_ping")
public class MessagesPingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "idMessages")
    private long idMessages;

    @Column(name = "operation")
    private String operation;

    @Column(name = "active")
    private int active;

    @Column(name = "mode")
    private int mode;

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private KontrollerPingEntity kontroller_ping;
}
