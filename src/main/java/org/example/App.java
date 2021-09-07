package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declaration
        double taxRate = 0.055;

        System.out.println("\nEnter the price of item 1: "); //ask for the price of item 1
        Scanner itemOnePriceInput = new Scanner(System.in); //scan for the price of item 1
        double itemOnePrice = itemOnePriceInput.nextDouble();

        System.out.println("\nEnter the quantity of item 1: "); //ask for the quantity of item 1
        Scanner itemOneQuantityInput = new Scanner(System.in); //scan for the quantity of item 1
        double itemOneQuantity = itemOneQuantityInput.nextDouble();

        System.out.println("\nEnter the price of item 2: "); //ask for the price of item 2
        Scanner itemTwoPriceInput = new Scanner(System.in); //scan for the price of item 2
        double itemTwoPrice = itemTwoPriceInput.nextDouble();

        System.out.println("\nEnter the quantity of item 2: "); //ask for the quantity of item 2
        Scanner itemTwoQuantityInput = new Scanner(System.in); //scan for the quantity of item 2
        double itemTwoQuantity = itemTwoQuantityInput.nextDouble();

        System.out.println("\nEnter the price of item 3: "); //ask for the price of item 3
        Scanner itemThreePriceInput = new Scanner(System.in); //scan for the price of item 3
        double itemThreePrice = itemThreePriceInput.nextDouble();

        System.out.println("\nEnter the quantity of item 3: "); //ask for the quantity of item 3
        Scanner itemThreeQuantityInput = new Scanner(System.in); //scan for the quantity of item 3
        double itemThreeQuantity = itemThreeQuantityInput.nextDouble();

        double subtotal = (itemOnePrice * itemOneQuantity) + (itemTwoPrice * itemTwoQuantity) + (itemThreePrice * itemThreeQuantity); //calculate the subtotal
        double tax = (subtotal * taxRate); //calculate the tax
        double totalCost = tax + subtotal; //calculate the total cost of the items at the self-checkout

        System.out.println("\nSubtotal: $" + String.format("%.2f", subtotal)); //output the subtotal to the user
        System.out.println("Tax: $" + String.format("%.2f", tax)); //output the amount of taxes to the user
        System.out.println("Total: $" + String.format("%.2f", totalCost)); //output the total cost to the user

    }
}