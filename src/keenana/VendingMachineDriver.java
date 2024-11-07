/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 6 - Vending Machine
 * Name: Andrew Keenan
 * Last Updated: 10-04-23
 */
package keenana;

import java.util.Scanner;

/**
 * This is the drive for the Vending Machine
 */
public class VendingMachineDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice;
        boolean done = false;

        VendingMachine vm = new VendingMachine();

        System.out.println("Welcome to John's vending machine!\n");

        do {
            System.out.println("Options: (i)nsert money, (s)elect an item, (q)uit");
            System.out.print("Enter i, s, or q ==> ");
            choice = in.nextLine().charAt(0);

            switch (choice) {
                case 'i', 'I' -> vm.insertMoney();
                case 's', 'S' -> vm.selectItem();
                case 'q', 'Q' -> done = true;
                default -> System.out.println("Invalid selection.");
            }
        } while(!done);
    }
}
