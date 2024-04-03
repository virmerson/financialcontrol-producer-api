package com.github.virmerson.financialtrackproducer.domain;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class Transaction {
        String description;
        Double amount;
}
