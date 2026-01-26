package com.kym.repository;

import com.kym.model.CreditCardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CreditCardTransactionRepository extends JpaRepository<CreditCardTransaction, Long> {
}
