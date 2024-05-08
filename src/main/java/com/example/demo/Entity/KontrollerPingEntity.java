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
@Table(name = "kontroller_ping")
public class KontrollerPingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "sn")
    private Long sn;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kontroller_ping")
    @Column(name = "messagesKontroller_id")
    private List<MessagesPingEntity> messages;

}
