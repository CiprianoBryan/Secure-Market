package com.securemarket.domain.service;

import com.securemarket.domain.model.client.ClientInquiry;

public interface ClientService {
    ClientInquiry getClient(String dni);
}
