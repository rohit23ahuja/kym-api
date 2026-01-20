package com.kym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Immutable
@Table(name = "creditcard_transaction")
public class CreditCardTransaction {

    @Id
    private Long id;

    private Long statementFileId;

    private String txnType;

    private String customerName;

    private LocalDate txnDate;

    private LocalTime txnTime;

    private String description;

    private Integer rewards;

    private BigDecimal amt;

    private String debitCredit;

    private String transactionCategorization;

    public Long getId() {
        return id;
    }

    public Long getStatementFileId() {
        return statementFileId;
    }

    public String getTxnType() {
        return txnType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getTxnDate() {
        return txnDate;
    }

    public LocalTime getTxnTime() {
        return txnTime;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRewards() {
        return rewards;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public String getDebitCredit() {
        return debitCredit;
    }

    public String getTransactionCategorization() {
        return transactionCategorization;
    }
}
