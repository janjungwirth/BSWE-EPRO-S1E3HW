package org.lecture;

import java.util.Scanner;

public class ContractGui extends Contract{

    public static Scanner inputScanner = new Scanner(System.in);
    public ContractGui(float saldo, float premier, float interest, int startYear, int endYear) {
        super(saldo, premier, interest, startYear, endYear);
    }

    public ContractGui(float premier, int endYear) {
        super(premier, endYear);
    }


    public static Contract createContract() {
        Contract temp = new Contract(0, 9999);
        boolean again=false;
        do {
            System.out.println("--- JBBS: New Contract menu ---");

            //Starting Saldo
            System.out.print("* starting Saldo:");
            temp.setSaldo(inputScanner.nextFloat());
            inputScanner.nextLine();

            //Premier
            System.out.print("* premier:");
            temp.setPremier(inputScanner.nextFloat());
            inputScanner.nextLine();

            //Interest
            System.out.print("* Interest:");
            temp.setInterest(inputScanner.nextFloat());
            inputScanner.nextLine();

            //start Year
            System.out.print("* start Year:");
            temp.setStartYear(inputScanner.nextInt());
            inputScanner.nextLine();

            //end Year
            System.out.print("* end Year:");
            temp.setEndYear(inputScanner.nextInt());
            inputScanner.nextLine();

            System.out.println("|   Contract correct? (y|n)   |");
            again = inputScanner.nextLine().toLowerCase().contains("y");
            System.out.println("-------------------------------");
        }while(!again);

        return temp;
    }

    public static void displayContract(Contract temp) {
        System.out.println("--- JBBS: New Contract menu ---");
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.printf("* premier: %.2f EUR%n", temp.getPremier());
        System.out.printf("* Interest: %.2f%% %n", temp.getInterest());
        System.out.printf("* start Year: %d%n", temp.getStartYear());
        System.out.printf("* end Year: %d%n", temp.getEndYear());
        System.out.printf("* runtime: %d years%n", temp.getRuntime());
        System.out.printf("* 80%% mark: TBC%n");

        System.out.println("|   press any key to continue   |");
        inputScanner.nextLine();
    }

    public static void displayMoney(Contract temp) {
        System.out.println("---   JBBS: Contract menu   ---");
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.println("|   press any key to continue   |");
        inputScanner.nextLine();
    }

    public static void withdrawMoney(Contract temp) {
        System.out.println("---   JBBS: Contract menu   ---");
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.printf("* withdraw: ");

        float withdrawment = inputScanner.nextFloat();
        inputScanner.nextLine();
        if(!temp.withdrawMoney(withdrawment))
            withdrawMoney(temp);
        else{
            System.out.println("Withdraw successful");
        }

    }

    public static void depositMoney(Contract temp) {
        System.out.println("---   JBBS: Contract menu   ---");
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.printf("* deposit: ");

        float deposit = inputScanner.nextFloat();
        temp.deposit(deposit);
        inputScanner.nextLine();
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.println("|   press any key to continue   |");
    }

    public static void calculateContract(Contract temp) {
        System.out.println("---   JBBS: Contract menu   ---");
        System.out.printf("* current Saldo: %.2f EUR%n", temp.getSaldo());
        System.out.println("|   press any key to continue   |");
        inputScanner.nextLine();
    }


}
