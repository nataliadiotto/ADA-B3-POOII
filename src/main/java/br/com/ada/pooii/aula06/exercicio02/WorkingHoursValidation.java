package br.com.ada.pooii.aula06.exercicio02;

import java.time.LocalDateTime;

public class WorkingHoursValidation implements Validation{

    private static final LocalDateTime limit = LocalDateTime.of(2024, 1, 19, 22, 0, 0);

    @Override
    public void validate(Transaction transaction) {
        if (transaction.getCreated().isAfter(limit)) {
            throw new RuntimeException("Invalid transaction: after working hours");
        }
    }
}
