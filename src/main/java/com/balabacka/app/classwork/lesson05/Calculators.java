package com.balabacka.app.classwork.lesson05;

import static com.balabacka.app.classwork.lesson05.CircleRadius.*;

/**
 * Created by pc on 27.01.2017.
 */
public class Calculators {
    public static void main( String[] args ){
        int menu=4;
        do {
            System.out.println("Test");
            menu = Scanner.menuScanner();
            switch (menu){
                case 1: calculateBigger();
                case 2: calculateBigger();
                case 3: calculateBigger();
            }
        }
        while (menu != 4);
        System.out.println("Thanks and hope to see you again!");
    }
}
