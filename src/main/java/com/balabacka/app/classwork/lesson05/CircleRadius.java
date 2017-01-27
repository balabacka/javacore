package com.balabacka.app.classwork.lesson05;

import java.util.Scanner;

/**
 * Created by pc on 27.01.2017.
 */
public class CircleRadius{

    public static final double PI= 3.14d;

    public static double scanner(String a){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter circle radius"+a);
        double radius= scanner.nextDouble();
        return radius;
    }

    public static double calculate(double radius){
        double circleArea= PI*radius*radius;
        return circleArea;
    }

    public static void calculateBigger(){

        double r1= scanner(" 1");
        double area1 = calculate(r1);

        double r2= scanner(" 2");
        double area2 = calculate(r2);

        System.out.println("Area 1 is " + area1);
        System.out.println("Area 2 is " + area2);

    if ((r1 >r2) || (area1 >area2)){
        System.out.println("Area 1 is bigger");
        System.out.println("Area 2 is smaller");
    }
    else if ((r1 <r2) || (area1 <area2)){
        System.out.println("Area 2 is bigger");
        System.out.println("Area 1 is smaller");
        }
    else System.out.println("Areas are equal");
    }


    public static void main( String[] args )
    {
        calculateBigger();
    }
}

