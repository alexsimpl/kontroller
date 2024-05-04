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
public class MessagesDto {
    private long id;
    // private long idMessages;
    private String operation;
    private String fw;
    private int active;
    private int mode;
    private String controllerIp;
    private String readerProtocol;
    private List<EventsDto> events;
    
}
