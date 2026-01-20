package com.kym.repository;

import com.kym.model.CreditCardTransaction;
import org.springframework.data.repository.CrudRepository;

public interface CreditCardTransactionRepository extends CrudRepository<CreditCardTransaction, Long> {
}
