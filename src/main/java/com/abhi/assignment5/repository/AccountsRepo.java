package com.abhi.assignment5.repository;

import com.abhi.assignment5.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountsRepo extends MongoRepository<Account, String> {


    Optional<Account> findByAccountID(String accountID);
}
