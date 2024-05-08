package com.example.demo.Entity.PowerOn;

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
@Table(name = "kontroller_poweron")
public class KontrollerPowerOnEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iD;

    @Column(name = "type")
    private String type;

    @Column(name = "sn")
    private long sn;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kontroller_poweron")
    @Column(name = "messagesKontroller_id")
    private List<MessagesPowerOnEntity> messages;
    

}
