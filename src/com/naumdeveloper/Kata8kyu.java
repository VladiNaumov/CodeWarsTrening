package com.naumdeveloper.codewars;

import java.util.HashMap;
import java.util.Optional;

public class Kata8kyu {

    public static void main(String[] args) {

    }

       

    /*
    Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

    */

    public static double squareArea(double A){
        double l = (2*A)/Math.PI;
        double x = l*l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }

    /*
        Summation
        Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

        For example:
        summation(2) -> 3
        1 + 2

        summation(8) -> 36
        1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
     */

    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        return sum;
    }


    /*
    Messi's Goal Total
    Use variables to find the sum of the goals Messi scored in 3 competitions

            Information
    Messi goal scoring statistics:

    Competition	Goals
    La Liga	43
    Champions League	10
    Copa del Rey	5

    Task:
    1. Create these three variables and store the appropriate values using the table above:
    -laLigaGoals
    -championsLeagueGoals
    -copaDelReyGoals
    2. Create a fourth variable named totalGoals that stores the sum of all of Messi's goals for this year.

     */

    public static void goalTotal(){
        final   int laLigaGoals = 43,
                championsLeagueGoals = 10,
                copaDelReyGoals = 5,
                totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
        System.out.println(totalGoals);
    }

    
            

   
}
