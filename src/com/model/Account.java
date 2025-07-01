package com.model;
import java.util.*;
public class Account {
    private String userName = "siva";
    private int password = 9090;

    public static Scanner in = new Scanner(System.in);
    
   public void Display(){
        System.out.println("ATM MACHINE MANAGEMENT SYSTEM !!!");
        System.out.println("1.LOGIN ");
        System.out.println("2.CREATE ACCOUNT ");
    }


    void createAccount(){
        System.out.println("Name : ");
        String userName = Account.in.nextLine();
        Account.in.nextLine();

        System.out.println("Create Password : ");
        int userPassword = Account.in.nextInt();
        Account.in.nextLine();

        System.out.println("✅ Account created successfully. Proceed to login.");
    }

    void loginAccount(){
        System.out.println("Name :");
        String checkname = Account.in.nextLine();

        System.out.println("Password : ");
        int checkPassword = Account.in.nextInt();
        Account.in.nextLine();

        if(ischeck(userName,checkPassword,checkname,password)){
            System.out.println("✅ Login successful! Welcome to the system.");
        }

        else{
             System.out.println("❌ Incorrect username or password.");
        }
    }

    private boolean ischeck(String uname,int cpass,String name,int pass){
        return (name.equals(uname) && pass == cpass);
    }

    

}
