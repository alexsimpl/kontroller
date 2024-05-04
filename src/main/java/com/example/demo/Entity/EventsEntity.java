package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "events")
public class EventsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "flag")
    private int flag;

    @Column(name = "event")
    private int event;

    @Column(name = "time")
    private String time;

    @Column(name = "card")
    private String card;

    @ManyToOne
    @JoinColumn(name = "eventsMessages_id")
    private MessagesEntity eventsMessages;

    // @ManyToOne
    // @JoinColumn(name = "eventsKontroller_id")
    // private KontrollerEntity eventsKontroller;
}
