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
// @ManyToOne
public class EventsEntity {

    @ManyToOne
    @JoinColumn(name = "messages_id")
    private MessagesEntity messages;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "flag")
    private String flag;

    @Column(name = "event")
    private String event;

    @Column(name = "time")
    private String time;

    @Column(name = "card")
    private String card;
}
