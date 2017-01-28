package com.balabacka.app.classwork.lessonTest;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by balabacka on 28.01.2017.
 */
public class CircleComparator {
    public static final double PI = 3.14d;

    //public static void valueScanner() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        //double pi= scanner.nextDouble();
        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
    */
        public static double valueScanner(String message, boolean positiveOnly) {

            double value =0;
            boolean status=false;
            do {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please enter " + message);
                    value = scanner.nextDouble();
                    if (positiveOnly) {
                        if (value > 0) {
                            status = true;
                        }
                        else System.out.println("Wrong input, try again");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter correct DOUBLE value");
                }
            }
            while (!status);
            return value;
        }


    public static double calc(double value) {
    double result = value*value*PI;
    return result;

    }

    public static void calculate() {

        double r1 = valueScanner("circle radius 1", true);
        double r2 = valueScanner("circle radius 2", true);

        double area1 = calc(r1);
        double area2 = calc(r2);

        if ((r1 > r2) || (area1 > area2)) {
            System.out.println("Area 1 is " + area1);
            System.out.println("Area 2 is " + area2);
            System.out.println("Area 1 is bigger");
            System.out.println("Area 2 is smaller");
        } else if ((r1 < r2) || (area1 < area2)) {
            System.out.println("Area 1 is " + area1);
            System.out.println("Area 2 is " + area2);
            System.out.println("Area 2 is bigger");
            System.out.println("Area 1 is smaller");
        } else {
            System.out.println("Area 1 is " + area1);
            System.out.println("Area 2 is " + area2);
            System.out.println("Areas are equal");

        }
    }
    public static void main(String[] args) {
        calculate();
    }
}