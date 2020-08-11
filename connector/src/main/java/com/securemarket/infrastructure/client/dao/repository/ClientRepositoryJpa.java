package com.securemarket.infrastructure.client.dao.repository;

import com.securemarket.infrastructure.client.dao.entity.ClientInquiryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryJpa extends JpaRepository<ClientInquiryEntity, Long> {
    @Query(value = "SELECT *" +
            " FROM CLIENT" +
            " WHERE DNI = :dni", nativeQuery = true)
    ClientInquiryEntity findClient(@Param("dni") String dni);
}
