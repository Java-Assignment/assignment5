package com.abhi.assignment5.controller;

import com.abhi.assignment5.entity.Account;
import com.abhi.assignment5.entity.AccountFinalResponse;
import com.abhi.assignment5.exception.AppAccountNotFoundException;
import com.abhi.assignment5.service.AccountService;
import com.abhi.assignment5.service.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountControllerImpl implements AccountController{
    @Autowired
    private AccountService accountService;
    @Override
    public ResponseEntity<AccountFinalResponse> get(String accountID) throws AppAccountNotFoundException {
        AccountFinalResponse accountFinalResponse=accountService.get(accountID);
        return  new ResponseEntity<>(accountFinalResponse,HttpStatus.OK) ;
    }
}
