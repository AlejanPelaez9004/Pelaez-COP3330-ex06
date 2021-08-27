/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args)
    {
        System.out.print("What is your current age? ");
        Scanner input = new Scanner(System.in);
        String sAge = input.next();
        System.out.print("At what age would you like to retire? ");
        String sRetireAge = input.next();
        int age = Integer.parseInt(sAge);
        int retireAge = Integer.parseInt(sRetireAge);

        int yearsLeft = retireAge - age;
        int year = LocalDateTime.now().getYear();
        int retireYear = year + yearsLeft;
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + retireYear + ".");
    }
}
