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
public class KontrollerEventDto {
    private long id;
    private String type;
    private Long sn;
    private List<MessagesEventDto> messages;
}