package com.securemarket.infrastructure.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientInquiryResponse {
    private String dni;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private LocalDateTime pastTime;
    private LocalDateTime nextTime;
    private int type;
}
