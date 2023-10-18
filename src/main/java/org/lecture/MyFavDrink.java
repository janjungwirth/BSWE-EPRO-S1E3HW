package org.lecture;

import java.util.Scanner;

public class MyFavDrink {
    private String name;
    private String brand;
    private Float alcohol;
    private boolean available;

    public MyFavDrink() {
    }

    public MyFavDrink askForDrink(Scanner inputScanner) {
        System.out.println("Whats the name of your Drink?");
        this.name = inputScanner.nextLine();
        System.out.println("Who is Producing the Drink?");
        this.brand = inputScanner.nextLine();
        System.out.println("Whats the alcohol value of your Drink?");
        this.alcohol = inputScanner.nextFloat();
        inputScanner.nextLine(); //getting rid of the formatting
        System.out.println("Is the Drink publicly available to buy? (y/n)");
        this.available = inputScanner.nextLine().toLowerCase().contains("y");
        return this;
    }

    public String toJson() {
        return String.format(
                "{" + this.getClass()
                        + "; name: " + this.name
                        + "; brand: " + this.brand
                        + "; alcohol: " + this.alcohol
                        + "; available: " + this.available
                        + "}");
    }
}
