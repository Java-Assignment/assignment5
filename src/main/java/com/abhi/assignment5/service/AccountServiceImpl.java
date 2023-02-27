package com.abhi.assignment5.service;

import com.abhi.assignment5.entity.Account;
import com.abhi.assignment5.entity.AccountEnrichment;
import com.abhi.assignment5.entity.AccountFinalResponse;
import com.abhi.assignment5.entity.CustomerEnrichment;
import com.abhi.assignment5.exception.AppAccountNotFoundException;
import com.abhi.assignment5.mapper.AccountMapper;
import com.abhi.assignment5.repository.AccountEnrichmentRepo;
import com.abhi.assignment5.repository.AccountFinalResponseRepo;
import com.abhi.assignment5.repository.AccountsRepo;
import com.abhi.assignment5.repository.CustomerEnrichmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountFinalResponseRepo accountFinalResponseRepo;
    @Autowired
    private AccountsRepo accountsRepo;
    @Autowired
    private AccountEnrichmentRepo accountEnrichmentRepo;
    @Autowired
    private CustomerEnrichmentRepo customerEnrichmentRepo;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public AccountFinalResponse get(String accountID) throws AppAccountNotFoundException {
        Optional<Account> ac=accountsRepo.findByAccountID(accountID);
        Optional<AccountEnrichment> accountEnrichment=accountEnrichmentRepo.findByAccountID(accountID);
        Optional<CustomerEnrichment> customerEnrichment=customerEnrichmentRepo.findByCustomerID(accountID);
        if(ac.isPresent()&& accountEnrichment.isPresent() && customerEnrichment.isPresent()){
            Account account=ac.get();
            AccountFinalResponse accountFinalResponse=accountMapper.convertActoAfr(account);
            AccountEnrichment ar=accountEnrichment.get();
            accountFinalResponse=accountMapper.convertAetoAfr(ar);
            CustomerEnrichment ce=customerEnrichment.get();
            accountFinalResponse=accountMapper.convertCetoAfr(ce);
            AccountFinalResponse accountFinalResponse1=accountFinalResponseRepo.save(accountFinalResponse);
            return  accountFinalResponse1;
        }
        else {
            throw new AppAccountNotFoundException("Account not found.account:"+accountID);
        }
    }
}
