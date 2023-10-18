package org.lecture;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Deposit {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Contract bausparer = new Contract(0,9999);
        Contract testContract = new Contract(10000,10,0.03f,2020,2023);
        mTLine(30);
        System.out.println("Welcome to JungwirthBanking Software Solutions - JBSS");

        int selection = selectOption();
        do {
            switch (selection) {
                case 99:
                    return;
                case 01:
                    bausparer = ContractGui.createContract();
                    break;
                case 02:
                    testContract.calculateOneMonthInterest();
                    break;
                case 03:
                    ContractGui.displayContract(bausparer);
                    break;
                case 10:
                    ContractGui.displayMoney(bausparer);
                    break;
                case 11:
                    ContractGui.withdrawMoney(bausparer);
                    break;
                case 12:
                    ContractGui.depositMoney(bausparer);
                    break;
            }
            selection=selectOption();
        }while(selection!=99);
    }

    private static int selectOption(){
        System.out.println("Plese select an action:");
        System.out.println("------------- JBSS -----------");
        System.out.println("| 01  : create new Contract   |");
        System.out.println("| 02  : calculate Contract    |");
        System.out.println("| 03  : display Contract      |");
        System.out.println("| 10  : display Money         |");
        System.out.println("| 11  : withdraw Money        |");
        System.out.println("| 12  : deposit Money         |");
        System.out.println("| 99  : quit application      |");
        System.out.println("-------------------------------");
        mTLine(7);


        int selection = inputScanner.nextInt();
        inputScanner.nextLine();

        return selection;

    }



    private static void mTLine(int lines){
        for (int i = 0; i < lines; i++) {
            System.out.println(" ");
        }
    }
}
