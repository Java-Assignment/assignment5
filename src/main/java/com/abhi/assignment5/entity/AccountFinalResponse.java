package com.abhi.assignment5.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Document(collection = "as5accounts")
public class AccountFinalResponse {
    @Id
    private String accountID;
    private String customerName;
    private Float accountBalance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;

    private AccountType accountType;
    private AccountStatus accountStatus;
    private int age;
    private Relationship relationship;
    private String address;
}
