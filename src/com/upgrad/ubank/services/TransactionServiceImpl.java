package com.upgrad.ubank.services;

import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImpl implements TransactionService{
    //Transaction array to store transaction objects for the application, later in the course
    //this array will be replaced with database
    private Transaction[] transactions;

    //counter is used to track how many transactions are present in the account array
    private int counter;

    public TransactionServiceImpl() {
        transactions = new Transaction[100];
        counter = 0;
    }


    @Override
    public Transaction createTransaction(Transaction transaction) {
       // return null;

        transactions[counter++]=transaction;
        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {

        for (int i=0; i<counter; i++) {
            if (transactions[i].getAccountNo() == accountNo) {
                System.out.println(transactions.toString());
                return transactions;
            }
        }
        return null;
    }
}
