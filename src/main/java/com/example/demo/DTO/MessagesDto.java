package com.example.demo.DTO;

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
    private String operation;
    private String fw;
    private int isActive;
    private int mode;
    private String controllerIp;
    private String readerProtocol;
    
}
