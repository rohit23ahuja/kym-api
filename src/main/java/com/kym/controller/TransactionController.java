package com.kym.controller;

import com.kym.model.CreditCardTransaction;
import com.kym.repository.CreditCardTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private CreditCardTransactionRepository creditCardTransactionRepository;

    @GetMapping(path = "/transactions")
    public Iterable<CreditCardTransaction> getTransactions(){
        return creditCardTransactionRepository.findAll();
    }
}
