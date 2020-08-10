package com.securemarket.service;

import com.securemarket.dto.request.ClientInquiryRequestDto;
import com.securemarket.dto.response.ClientInquiryResponseDto;

public interface ClientApplicationService {
    ClientInquiryResponseDto getClient(ClientInquiryRequestDto clientInquiryRequestDto);
}
