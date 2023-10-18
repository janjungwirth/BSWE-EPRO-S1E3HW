package org.lecture;

import java.util.Scanner;

/*
Write your own main-method (60%)

Create a project according to our guidelines

TODO
0. Have your own main class (check)
1. print out a couple of sentences with line breaks (check)
2. print out a couple of sentences without line breaks (check)
3. Input a number via Scanner. (check)
4. Use System.out.format and output (check)
 +1 number plus your name
 +2 your pet’s name (fav car brand, … whatever you like).
0. Choose a meaningful text with formatters (hopefully check)

Upload your video here HW L1 - Main and provide the link to the video in the comment section.
Naming convention for Video: L1_<Lastname>_<Firstname>.mpeg4
*/
public class MyHomeworkClass {

    //this is my own main class
    public static void main(String[] args) {

        //1st: print out a couple of sentences with line breaks
        System.out.printf("%s %n %s %n", "This is a sentence", "with line breaks.");
        System.out.printf("%s %n %s %n", "This is another sentence.", "These Sentence are printed using " +
                "the formatted print functionality.");

        //2nd Requirement: print out a couple of sentences without line breaks
        System.out.print("This is a sentence, without line breaks.");
        System.out.println("This is another sentence, without line breaks. Therefore it is written as " +
                "given using the pint functionality.");

        //3rd Requirement: Input a number via Scanner.
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer numberFromConsole = inputScanner.nextInt();
        inputScanner.nextLine(); //Important to get the Enter/additional formatting character after the Integer
        System.out.printf("This is your Number: %d%n", numberFromConsole);

        //4th (1) Requirement: 4. Use System.out.format and output
        // +1 number plus your name
        System.out.println("Please enter your name:");
        String name = inputScanner.nextLine();
        System.out.println("Please enter your age:");
        Integer age = inputScanner.nextInt();
        inputScanner.nextLine(); //Important to get the Enter/additional formatting character after the Integer
        System.out.format("Hello %s! You are %d years old.%n", name, age);

        //4th (1) Requirement: 4. Use System.out.format and output
        // +2 your pet’s name (fav car brand, … whatever you like).
        MyFavDrink drink = new MyFavDrink();
        System.out.println(drink.askForDrink(inputScanner).toJson());


    }


}
