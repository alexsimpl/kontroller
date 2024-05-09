package com.example.demo.DTO;

// import java.util.List;

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
    private String conn_fw;
    private int active;
    private int mode;
    private String controller_ip;
    private String reader_protocol;
    // private List<EventsDto> events;
    
}
