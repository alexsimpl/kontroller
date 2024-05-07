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
@Table(name = "kontroller_answer")
public class KontrollerAnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "interval")
    private int interval;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kontroller_answer")
    @Column(name = "messagesKontroller_id")
    private List<MessagesAnswerEntity> messages;
    

}
