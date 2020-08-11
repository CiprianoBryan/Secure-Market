package com.securemarket.infrastructure.client.repository;

import com.securemarket.domain.repository.ClientRepository;
import com.securemarket.infrastructure.client.dao.entity.ClientInquiryEntity;
import com.securemarket.infrastructure.client.dao.repository.ClientRepositoryJpa;
import com.securemarket.infrastructure.client.mapper.ClientMapper;
import com.securemarket.infrastructure.client.model.ClientInquiryResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class ClientRepositoryImpl implements ClientRepository {
    private ClientRepositoryJpa clientRepositoryJpa;

    @Autowired
    public void setClientRepositoryJpa(ClientRepositoryJpa clientRepositoryJpa) {
        this.clientRepositoryJpa = clientRepositoryJpa;
    }

    @Override
    public ClientInquiryResponse getClient(String dni) {
        ClientInquiryEntity clientInquiryEntity = clientRepositoryJpa.findClient(dni);
        return ClientMapper.INSTANCE.map(clientInquiryEntity);
    }
}
