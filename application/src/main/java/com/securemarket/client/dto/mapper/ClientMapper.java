package com.securemarket.client.dto.mapper;

import com.securemarket.domain.model.client.ClientInquiry;
import com.securemarket.client.dto.response.ClientInquiryResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    default ClientInquiryResponseDto map(ClientInquiry clientInquiry) {
        return ClientInquiryResponseDto.builder()
                .dni(clientInquiry.getDni())
                .names(clientInquiry.getNames())
                .age(clientInquiry.getAge())
                .pastTime(clientInquiry.getPastTime())
                .nextTime(clientInquiry.getNextTime())
                .passed(clientInquiry.getPassed())
                .message(clientInquiry.getMessage())
                .build();
    }
}
