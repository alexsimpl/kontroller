package com.example.demo.Entity.PowerOn;


// import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "messages_poweron")
public class MessagesPowerOnEntity {

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

    @Column(name = "mode")
    private int mode;

    @Column(name = "events_success")
    private int events_success;

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private KontrollerPowerOnEntity kontroller_poweron;
}
