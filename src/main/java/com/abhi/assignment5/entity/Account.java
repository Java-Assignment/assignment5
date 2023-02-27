package com.abhi.assignment5.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Document(collection = "as2accounts")
@Data
@NoArgsConstructor
public class Account {

    @Id
    private String accountID;
    private String customerName;
    private Float accountBalance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;

    private AccountType accountType;
    private AccountStatus accountStatus;





}
