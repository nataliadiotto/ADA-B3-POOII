package br.com.ada.pooii.aula06.exercicio02;

import java.math.BigDecimal;

public class MaxDailyValidation implements Validation {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1500");

    @Override
    public void validate(Transaction transaction) {
        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("Invalid transaction: max limit");
        }
    }
}
