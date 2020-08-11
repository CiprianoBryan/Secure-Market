package com.securemarket.infrastructure.client.mapper;

import com.securemarket.domain.model.client.ClientInquiry;
import com.securemarket.infrastructure.client.dao.entity.ClientInquiryEntity;
import com.securemarket.infrastructure.client.model.ClientInquiryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    default ClientInquiryResponse map(ClientInquiryEntity clientInquiryEntity) {

        return ClientInquiryResponse.builder()
                .dni(clientInquiryEntity.getDni())
                .name(clientInquiryEntity.getName())
                .lastName(clientInquiryEntity.getLastName())
                .birthdate(clientInquiryEntity.getBirthdate())
                .pastTime(clientInquiryEntity.getPastTime())
                .nextTime(clientInquiryEntity.getNextTime())
                .type(clientInquiryEntity.getType())
                .build();
    }
}
