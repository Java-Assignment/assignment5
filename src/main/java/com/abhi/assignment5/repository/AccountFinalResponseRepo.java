package com.abhi.assignment5.repository;

import com.abhi.assignment5.entity.AccountFinalResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountFinalResponseRepo extends MongoRepository<AccountFinalResponse,String> {
}
