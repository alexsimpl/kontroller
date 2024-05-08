package com.example.demo.DTO.Event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EventsEventDto {
    private long id;
    private int flag;
    private int event;
    private String time;
    private String card;
}