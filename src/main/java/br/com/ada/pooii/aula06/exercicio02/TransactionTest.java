package br.com.ada.pooii.aula06.exercicio02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionTest {
    public static void main(String[] args) {

        List<Validation> validations = new ArrayList<>();
        validations.add(new MinMaxDailyValidation());
        validations.add(new WorkingHoursValidation());

        TransactionManager manager = new TransactionManager(validations);

        var t1 = new Transaction(new BigDecimal("1000"), "ADA");

        manager.executeTrade(t1);

    }
}
