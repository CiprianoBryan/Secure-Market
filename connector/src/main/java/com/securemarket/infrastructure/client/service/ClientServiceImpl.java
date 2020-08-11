package com.securemarket.infrastructure.client.service;

import com.securemarket.domain.model.client.ClientInquiry;
import com.securemarket.domain.repository.ClientRepository;
import com.securemarket.domain.service.ClientService;
import com.securemarket.infrastructure.client.model.ClientInquiryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

@Component
public class ClientServiceImpl implements ClientService {
    private final int GREATEST_AGE = 60;
    private final int LOWEST_AGE = 18;
    private final String MESSAGE_OK = "Puede ingresar";
    private final String ERROR_EDAD = "La edad no se encuentra en el rango";
    private final String ERROR_TIME = "Aún no puede ingresar";

    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientInquiry getClient(String dni) {
        ClientInquiryResponse clientInquiryResponse = clientRepository.getClient(dni);

        LocalDate birthdate = clientInquiryResponse.getBirthdate();
        LocalDate now = LocalDate.now();
        int age = birthdate.getYear() - now.getYear();
        if (birthdate.getDayOfYear() > now.getDayOfYear()) {
            age -= 1;
        }

        Boolean passed = true;
        String message = MESSAGE_OK;
        if (now.isBefore(ChronoLocalDate.from(clientInquiryResponse.getNextTime()))) {
            passed = false;
            message = ERROR_TIME;
        }
        if (LOWEST_AGE > age || age > GREATEST_AGE) {
            passed = false;
            message = ERROR_EDAD;
        }

        return ClientInquiry.builder()
                .dni(clientInquiryResponse.getDni())
                .names(clientInquiryResponse.getLastName() + ", " + clientInquiryResponse.getName())
                .age(age)
                .pastTime(clientInquiryResponse.getPastTime())
                .nextTime(clientInquiryResponse.getNextTime())
                .passed(passed)
                .message(message)
                .build();
    }
}
