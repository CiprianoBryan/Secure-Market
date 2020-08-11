package com.securemarket.client.service;

import com.securemarket.client.dto.request.ClientInquiryRequestDto;
import com.securemarket.client.dto.response.ClientInquiryResponseDto;

public interface ClientApplicationService {
    ClientInquiryResponseDto getClient(ClientInquiryRequestDto clientInquiryRequestDto);
}
