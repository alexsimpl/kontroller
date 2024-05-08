package com.example.demo.DTO.Event;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MessagesEventDto {
    private long id;
    private long idMessages;
    private String operation;
    private int active;
    private int mode;
    private int success;
    private List<EventsEventDto> events;

}
