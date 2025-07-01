package com.model;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        Transaction tra = new Transaction();
        account.Display();

        int type = Account.in.nextInt();
        Account.in.nextLine();

        if(type == 1){
            account.loginAccount();
        }

        if(type == 2){
            account.createAccount();
        }

        tra.transactionProcess();
    }
}
