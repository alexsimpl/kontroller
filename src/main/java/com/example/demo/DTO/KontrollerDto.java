package com.example.demo.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KontrollerDto {
    private long id;
    private String type;
    private String sn;
    private List<MessagesDto> messages;
    private List<EventsDto> events;
}
