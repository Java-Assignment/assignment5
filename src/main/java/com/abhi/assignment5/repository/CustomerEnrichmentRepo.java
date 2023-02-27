package com.abhi.assignment5.repository;

import com.abhi.assignment5.entity.CustomerEnrichment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CustomerEnrichmentRepo extends MongoRepository<CustomerEnrichment,String> {
    Optional<CustomerEnrichment> findByCustomerName();

    Optional<CustomerEnrichment> findByCustomerID(String accountID);
}
