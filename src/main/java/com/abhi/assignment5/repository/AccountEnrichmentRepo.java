package com.abhi.assignment5.repository;

import com.abhi.assignment5.entity.AccountEnrichment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountEnrichmentRepo extends MongoRepository<AccountEnrichment, String> {
    Optional<AccountEnrichment> findByAccountID(String accountID);
}
