package com.company;
import javax.swing.*;
import java.time.Year;
import java.util.Scanner;
import java.util.Calendar;



public class Main {

    static void practicalTaskNo1_3() {
        int day = 9;
        int month = 5;
        int year = 2021;
        int formatting1 = 3;


        {

            if (day >= 1 && day <= 31) {

            } else {
                System.out.println("Invalid number");
            }

        }
        if (month >= 1 && month <= 12) {

        } else {
            System.out.println("Invalid number");
        }
        if (year >= 1932 && year <= 2090) {

        } else {
            System.out.println("Invalid number");
        }
        {
            System.out.println("Your date is " + day + "/" + month + "/" + year + "/");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the day: ");
        day = input.nextInt();
        if (day >= 1 && day <= 31) ;
        else
            System.out.println("Invalid number");

        System.out.println("Please write the month: ");
        month = input.nextInt();
        if (month >= 1 && month <= 12) ;
        else
            System.out.println("Invalid number");

        System.out.println("Please write the year: ");
        year = input.nextInt();
        if (year >= 1932 && year <= 2090) ;
        else
            System.out.println("Invalid number");


        System.out.println("Please select the date formatting: 1 - YYYY/MM/DD or 2 - DD.MM.YYYY");
        formatting1 = input.nextInt();
        if (formatting1 == 1)
            System.out.println("Your date is " + year + "/" + month + "/" + day);
        else if (formatting1 != 1)
            if (formatting1 == 2)
                System.out.println("Your date is " + day + "/" + month + "/" + year);


    }
    static void practicalTaskNo1_4() {

        Scanner months = new Scanner(System.in);
        System.out.println("Please enter day number: ");
        int number = months.nextInt();

        if (number >= 1 && number <= 31)
        {
            System.out.println("It is January");
        }else if (number >= 32 && number <= 60) {
            System.out.println("It is February");
        }else if (number >= 61 && number<=91) {
            System.out.println("It is March ");
        }else if (number>=92 && number<=121) {
            System.out.println("It is April");
        }else if (number>=122 && number<=152) {
            System.out.println("It is May");
        }else if (number>=153 && number<=182) {
            System.out.println("It is June");
        }else if (number>=183 && number<=213) {
            System.out.println("It is July");
        }else if (number>=214 && number<=244) {
            System.out.println("It is August");
        }else if (number>=245 && number<=274) {
            System.out.println("It is September");
        }else if (number>=275 && number<=305) {
            System.out.println("It is October");
        }else if (number>=306 && number<=335) {
            System.out.println("It is November");
        }else if (number>=336 && number<=366) {
            System.out.println("It is December");
        }else {
            System.out.println("Incorrect day of year. Please try again!");


        }

    }
    static void displayHighScorePosition() {
        //String player = "John";
        //int place = 1;
        Scanner displayHighScorePosition = new Scanner(System.in);
        System.out.println("Please enter player's name: ");
        String playersName = displayHighScorePosition.nextLine();
        System.out.println("Please enter player's score: ");
        int place = displayHighScorePosition.nextInt();


        if (place>=1 && place<=4)
            System.out.println(playersName + " managed to get into  " + place + "th position on the high score table");
        else
            System.out.println("Incorrect place. It is possible to get places starting from 1 to 4.");
    }
    static void calculateHighScorePosition() {

        displayHighScorePosition();
        Scanner calculateHighScorePosition = new Scanner(System.in);
        System.out.println("Please enter player's score: ");
        int score = calculateHighScorePosition.nextInt();

        if (score >= 1000) {
        System.out.println("Player with this score is in 1th position");
        }else if (score >= 500 && score<1000) {
            System.out.println("Player with this score is in 2th position");
        }else if (score >= 100 && score<500) {
            System.out.println("Player with this score is in 3th position");
        }else if (score>=0 && score <100) {
            System.out.println("Player with this score is in 4th position");
        }else{
            System.out.println("Invalid score! Valid score is starting from 0 and higher.");
        }


    }
    static void toMilesPerHour() {

        double kilometersPerHour=987765.999998;
        long rounderLong=(long)kilometersPerHour;

        if (kilometersPerHour<=-1)
            System.out.println("Error -1! (Invalid value)");
        else
            System.out.println(rounderLong);


    }


    public static void main(String[] args) {
        //practicalTaskNo1_3();
        //practicalTaskNo1_4();
        //displayHighScorePosition();
        //calculateHighScorePosition();
        toMilesPerHour();





    }

}
