package com.securemarket.infrastructure.client.dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class ClientInquiryEntity {
    @Id
    @Column(name = "DNI")
    private String dni;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;
    @Column(name = "PAST_TIME")
    private LocalDateTime pastTime;
    @Column(name = "NEXT_TIME")
    private LocalDateTime nextTime;
    @Column(name = "TYPE")
    private int type;
}
