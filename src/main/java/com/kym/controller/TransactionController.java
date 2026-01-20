package com.kym.controller;

import com.kym.model.CreditCardTransaction;
import com.kym.repository.CreditCardTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class TransactionController {

    @Autowired
    private CreditCardTransactionRepository creditCardTransactionRepository;

    @GetMapping(path = "/transactions")
    public Iterable<CreditCardTransaction> getTransactions() {
        return creditCardTransactionRepository.findAll();
    }
}
