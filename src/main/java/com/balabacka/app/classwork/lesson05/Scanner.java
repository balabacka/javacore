package com.balabacka.app.classwork.lesson05;

import java.util.InputMismatchException;

/**
 * Created by pc on 27.01.2017.
 */
public class Scanner {

    public static int menuScanner() {

        int value = 0;
        boolean status=true;
        do {
            try {

                System.out.println("Please choose calculator 1-3, 4 to quit");
                System.out.println("1 - Circle comparator");
                System.out.println("2 - Triangle checker");
                System.out.println("3 - Odd/Even checker");
                System.out.println("4 - Quit");

                java.util.Scanner scanner = new java.util.Scanner(System.in);
                value = scanner.nextInt();
                if (value>=1 && value <=4){
                status = false;
                }
                else System.out.println("Wrong input, try again");
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter correct INT value");
            }
        }
        while (status);
        return value;
    }


    public static double valueScanner(String a) {

        double value = 0;
        boolean status=true;
        do {
            try {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.println("Please enter " + a);
                value = scanner.nextDouble();
                status = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter correct DOUBLE value");
            }
        }
        while (status);
        return value;
    }
}
