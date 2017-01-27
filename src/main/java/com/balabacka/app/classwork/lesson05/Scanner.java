package com.balabacka.app.classwork.lesson05;

import java.util.InputMismatchException;

/**
 * Created by pc on 27.01.2017.
 */
public class Scanner {

    public static double scanner(String a) {

        double radius = 0;
        boolean status=true;
        do {
            try {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.println("Please enter circle radius" + a);
                radius = scanner.nextDouble();
                status = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter correct DOUBLE value");
            }
        }
        while (status);
        return radius;
    }
}
