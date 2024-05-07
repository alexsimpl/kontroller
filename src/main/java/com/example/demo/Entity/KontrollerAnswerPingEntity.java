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
@Table(name = "kontroller_answerPing")
public class KontrollerAnswerPingEntity {
    @Id
    private long id;

    @Column(name = "date")
    private String date;

    @Column(name = "interval")
    private int interval;

    @Column(name = "messages")
    private List<String> messages;
}
