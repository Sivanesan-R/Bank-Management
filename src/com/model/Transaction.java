package com.model;

public class Transaction {
    private int balance;

    public void transactionProcess() {
        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1.Check Your Balance");
            System.out.println("2.Withdraw Money ");
            System.out.println("3.Deposit Money ");
            System.out.println("4.Exit ");

            System.out.print("Choose an option: ");
            int choice = Account.in.nextInt();
            Account.in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance : $" + balance);
                    break;
                case 2:
                    withdr();

                    break;
                case 3:
                    depo();

                    break;
                case 4:
                    System.out.println("👋 Exit successful. Thank you!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
                    break;
            }
        }

    }

    private void withdr() {
        System.out.println("Withdraw Amount : ");
        int with = Account.in.nextInt();
        Account.in.nextLine();
        if (with <= balance) {
            balance -= with;
            System.out.println("Withdraw is Sucessful. Remaining Balance : $" + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }

    }

    private void depo() {
        System.out.println("Deposit Amount : ");
        int depos = Account.in.nextInt();
        Account.in.nextLine();
        balance += depos;
        System.out.println("Deposit Process Sucessful. Now Current Balance : $" + balance);
    }
 
}
