package com.example.demo.DTO.Answer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KontrollerAnswerDto {
    private long id;
    private String date;
    private int interval;
    private List<MessagesAnswerDto> messages;
}
