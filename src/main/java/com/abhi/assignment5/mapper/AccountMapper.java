package com.abhi.assignment5.mapper;

import com.abhi.assignment5.entity.Account;
import com.abhi.assignment5.entity.AccountEnrichment;
import com.abhi.assignment5.entity.AccountFinalResponse;
import com.abhi.assignment5.entity.CustomerEnrichment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountFinalResponse convertActoAfr(Account account);

    AccountFinalResponse convertAetoAfr(AccountEnrichment ar);

    AccountFinalResponse convertCetoAfr(CustomerEnrichment ce);
}
