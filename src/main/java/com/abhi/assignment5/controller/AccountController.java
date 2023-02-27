package com.abhi.assignment5.controller;

import com.abhi.assignment5.entity.AccountFinalResponse;
import com.abhi.assignment5.exception.AppAccountNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/accounts",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@Validated
@Tag(name = "Account Management API",description = "API for all account related operations.")
public interface AccountController {
    @GetMapping("/{accountID}")
    @Operation(summary = "Get all information")
    ResponseEntity<AccountFinalResponse> get(@PathVariable("accountID") @NotNull @Length(min = 12, max = 12) String accountID) throws AppAccountNotFoundException;
}
