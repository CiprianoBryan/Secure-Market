package com.securemarket.client.service;

import com.securemarket.domain.model.client.ClientInquiry;
import com.securemarket.domain.service.ClientService;
import com.securemarket.client.dto.mapper.ClientMapper;
import com.securemarket.client.dto.request.ClientInquiryRequestDto;
import com.securemarket.client.dto.response.ClientInquiryResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientApplicationServiceImpl implements ClientApplicationService {
    private ClientService clientService;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public ClientInquiryResponseDto getClient(ClientInquiryRequestDto clientInquiryRequestDto) {
        ClientInquiry clientInquiry = clientService.getClient(clientInquiryRequestDto.getDni());
        return ClientMapper.INSTANCE.map(clientInquiry);
    }
}
