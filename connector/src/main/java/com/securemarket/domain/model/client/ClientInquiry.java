package com.securemarket.domain.model.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientInquiry {
    private String dni;
    private String names;
    private int age;
    private LocalDateTime pastTime;
    private LocalDateTime nextTime;
    private Boolean passed;
    private String message;
}
