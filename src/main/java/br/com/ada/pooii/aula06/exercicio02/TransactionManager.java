package br.com.ada.pooii.aula06.exercicio02;

import java.util.List;

public class TransactionManager {

    private final List<Validation> validationRules;

    public TransactionManager(List<Validation> validationRules) {
        this.validationRules = validationRules;
    }

    void executeTrade(Transaction transaction) {
        // verify if stock is available for trading
        if (transaction.getStock().equals(null)) {
            throw new RuntimeException("Invalid transaction: stock not available");
        }

        // executar transacao
        for (Validation validation: validationRules) {
            validation.validate(transaction);
        }
        transact(transaction);

    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }


}
