package com.balabacka.app.classwork.lesson05;
/**
 * Created by pc on 27.01.2017.
 */
public class CircleRadius{

    public static final double PI= 3.14d;



    public static double calculate(double radius){
        double circleArea= PI*radius*radius;
        return circleArea;
    }

    public static void calculateBigger(){

        double r1= Scanner.valueScanner("circle radius 1");
        double area1 = calculate(r1);

        double r2= Scanner.valueScanner("circle radius 2");
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

