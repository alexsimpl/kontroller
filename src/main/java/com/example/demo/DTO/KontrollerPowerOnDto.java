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
public class KontrollerPowerOnDto {
    private long id;
    private String type;
    private Long sn;
    private List<MessagesPowerOnDto> messages;
}
