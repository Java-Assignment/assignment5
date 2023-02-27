package com.abhi.assignment5.service;

import com.abhi.assignment5.entity.AccountFinalResponse;
import com.abhi.assignment5.exception.AppAccountNotFoundException;

public interface AccountService {

    AccountFinalResponse get(String accountID) throws AppAccountNotFoundException;
}
