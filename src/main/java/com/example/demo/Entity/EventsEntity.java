package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "events")
public class EventsEntity {
    @Column(name = "flag")
    private String flag;

    @Column(name = "event")
    private String event;

    @Column(name = "time")
    private String time;

    @Column(name = "card")
    private String card;
}
