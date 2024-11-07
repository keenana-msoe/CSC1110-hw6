/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 6 - Vending Machine
 * Name: Andrew keenan
 * Last Updated: 10-04-23
 */
package keenana;


import java.util.Scanner;

/**
 * This class has methods that do the math for entering money into
 * and out of the machine and also spitting out exact change
 * from your purchase
 */
public class VendingMachine {
    private double paymentSum;
    private final Scanner scan = new Scanner(System.in);

    /**
     * This method is used to enter money into the vending machine.
     * the user will input how much money thy want to add.
     */
    public void insertMoney() {
        boolean positive = false;
        do {
            System.out.print("How much money do you enter into the machine?: ");
            double insert = scan.nextDouble();
            if (insert > 0) {
                paymentSum = paymentSum + insert;
                positive = true;
            } else{
                System.out.println("Invalid amount of money, must be greater than 0");
            }
        } while (!positive);
    }

    /**
     * This method simulated buying an item form the machine and spitting out
     * the correct and exact change for said item
     */
    public void selectItem() {
        boolean positive = false;
        do {
            System.out.print("Enter the price of the item you wish to purchase: ");
            double price = scan.nextDouble();
            if (price > 0) {
                positive = true;
                paymentSum = paymentSum - price;
            } else{
                System.out.println("invalid price must be a positive number.");
            }
        } while (!positive);
        //printing out the change
        final double quarterValue = 0.25;
        final double dimeValue = 0.1;
        final double nickelValue = 0.05;
        final double pennyValue = 0.01;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while (paymentSum >= quarterValue){
            paymentSum = paymentSum - quarterValue;
            quarters++;
        }
        while (paymentSum >= dimeValue){
            paymentSum = paymentSum - dimeValue;
            dimes++;
        }
        while (paymentSum >= nickelValue){
            paymentSum = paymentSum - nickelValue;
            nickels++;
        }
        while (paymentSum >= 0){
            paymentSum = paymentSum - pennyValue;
            pennies++;
        }
        System.out.println("Your change is: ");
        System.out.println("================");
        System.out.println(quarters+" Quarter(s)");
        System.out.println(dimes+" Dime(s)");
        System.out.println(nickels+" Nickel(s)");
        System.out.println(pennies+" Penny(ies)");
    }
}
