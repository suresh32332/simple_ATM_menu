package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pin = 1234;
        double balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you PIN : ");
        int enterPin = sc.nextInt();
        if (enterPin != pin) {
            System.out.println("Invalid Pin Enter the correct Pin ");
            return;
        } else {
            int choice;
            do {
                System.out.println("====== ATM Menu ======");
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Exit");
                System.out.println("Enter choice :");
                choice = sc.nextInt();
                if (choice <= 4) {
                    switch (choice) {
                        case 1:
                            System.out.println("Check Balance");
                            System.out.println("Your Account Balance : " + balance);
                            break;
                        case 2:
                            System.out.println("Deposit");
                            System.out.println("Enter amount : ");
                            double deposit = sc.nextDouble();
                            if (deposit >= 0) {
                                balance += deposit;
                                System.out.println(" Deposit Successfully");
                            } else {
                                System.out.println("Invalid! ");
                            }
                            break;
                        case 3:
                            System.out.println("Withdraw");
                            System.out.println("Enter amount : ");
                            double withdraw = sc.nextDouble();
                            if (withdraw > 0 && withdraw <= balance) {
                                System.out.println("Withdraw Successfully");
                                balance -= withdraw;
                            } else {
                                System.out.println("Insufficient balance or invalid amount");
                            }
                            break;
                        case 4:
                            System.out.println("Thank you for using ATM ,Goodbye ");
                            break;
                        default:
                            System.out.println("Invalid try again !");
                            break;
                    }
                } else {
                    System.out.println("Invalid choice Try again !");
                }
            } while (choice != 4);
        }
    }
}


