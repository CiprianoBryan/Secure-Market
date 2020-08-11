package com.securemarket.domain.repository;

import com.securemarket.infrastructure.client.model.ClientInquiryResponse;

public interface ClientRepository {
    ClientInquiryResponse getClient(String dni);
}
