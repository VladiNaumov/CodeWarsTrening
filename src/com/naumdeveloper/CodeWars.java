package com.naumdeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodeWars {

    /*
    Can you find the needle in the haystack?
    Write a function findNeedle() that takes an array full of junk but containing one "needle"
    After your function finds the needle it should return a message (as a string) that says:
    "found the needle at position " plus the index it found the needle, so:

    findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
    should return "found the needle at position 5"
     */

    public static String findNeedle(Object[] haystack) {


        return "";
    }


    /*

    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

    Examples
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"
    Notes
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
     */

    public static String highAndLow(String numbers) {
        // Code here or
        return "throw towel";
    }

   /*
   Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

    If you want to know more: http://en.wikipedia.org/wiki/DNA

    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell);
    you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

    More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

    Example: (input --> output)

    "ATTGC" --> "TAACG"
    "GTAT" --> "CATA"
    dnaStrand []        `shouldBe` []
    dnaStrand [A,T,G,C] `shouldBe` [T,A,C,G]
    dnaStrand [G,T,A,T] `shouldBe` [C,A,T,A]
    dnaStrand [A,A,A,A] `shouldBe` [T,T,T,T]
    */

    public static String makeComplement(String dna) {

        return "";
    }

    /*
    You might know some pretty large perfect squares. But what about the NEXT one?

        Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
        Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

        If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.

        Examples:(Input --> Output)

        121 --> 144
        625 --> 676
        114 --> -1 since 114 is not a perfect square
     */

    public static long findNextSquare(long sq) {

        return 0;
    }

/*
    Complete the solution so that it reverses all of the words within the string passed in.

    Example:

    "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

    public static String reverseWords(String str){
        //write your code here...
        return "";
    }

    /*
    Nathan loves cycling.

    Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

    You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

    For example:

    time = 3 ----> litres = 1

    time = 6.7---> litres = 3

    time = 11.8--> litres = 5
     */

    public int Liters(double time)  {

        //Your code goes here! Hint: You should change that -1
        return -1;

    }

    /*
    It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
    You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
     */

    public static String remove(String str) {

        return "";
    }

    /*
    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

    Examples input/output:

    XO("ooxx") => true
    XO("xooxx") => false
    XO("ooxXm") => true
    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    XO("zzoo") => false
     */

    public static boolean getXO (String str) {

        return true;

    }

    /*
    Description:
    Make a simple function called greet that returns the most-famous "hello world!".

    Style Points
    Sure, this is about as easy as it gets. But how clever can you be to create the most creative hello world you can think of?
    What is a "hello world" solution you would want to show your friends?
     */

    public static String greet() {
        return "hello world!";
    }

    /*
    Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

    invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
    invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
    invert([]) == []
     */

    public static int[] invert(int[] array) {

        return null;
    }

    /*
    Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and the lowest element (the value, not the index!).
    (The highest/lowest element is respectively only one element at each edge, even if there are more than one with the same value!)

    Example:

    { 6, 2, 1, 8, 10 } => 16
    { 1, 1, 11, 2, 3 } => 6

    If array is empty, null or None, or if only 1 Element exists, return 0.
    Note:In C++ instead null an empty vector is used. In C there is no null. ;-)
     */

    public static int sum(int[] numbers)
    {
        return 0;
    }

    /*
    Given an array of integers.

    Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

    If the input array is empty or null, return an empty array.

    Example
    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
     */

    public static int[] countPositivesSumNegatives(int[] input)
    {
        return null; //return an array with count of positives and sum of negatives
    }

    /*
    Given an array of integers, return a new array with each value doubled.

    For example:

    [1, 2, 3] --> [2, 4, 6]
     */

    public static int[] map(int[] arr) {

        return new int[0];
    }

    /*

    Build a function that returns an array of integers from n to 1 where n>0.

    Example : n=5 --> [5,4,3,2,1]
     */

    public static int[] reverse(int n){
        //your code
        return new int[0];
    }

    /*
    Simple, remove the spaces from the string, then return the resultant string.
     */

    public static String noSpace(final String x) {
        return  x;
    }

    /*
    Will you make it?
    You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away!
    You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left. Considering these factors, write a function that tells you if it is possible to get to the pump or not.
    Function should return true (1 in Prolog) if it is possible and false (0 in Prolog) if not.
    The input values are always positive.
     */

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return true;
    }

    /*
    ou task is to implement an simple interpreter for the notorious esoteric language HQ9+ that will work for a single character input:

    If the input is 'H', return 'Hello World!'
    If the input is 'Q', return the input
    If the input is '9', return the full lyrics of 99 Bottles of Beer. It should be formatted like this:
    99 bottles of beer on the wall, 99 bottles of beer.
    Take one down and pass it around, 98 bottles of beer on the wall.
    98 bottles of beer on the wall, 98 bottles of beer.
    Take one down and pass it around, 97 bottles of beer on the wall.
    97 bottles of beer on the wall, 97 bottles of beer.
    Take one down and pass it around, 96 bottles of beer on the wall.
    ...
    ...
    ...
    2 bottles of beer on the wall, 2 bottles of beer.
    Take one down and pass it around, 1 bottle of beer on the wall.
    1 bottle of beer on the wall, 1 bottle of beer.
    Take one down and pass it around, no more bottles of beer on the wall.
    No more bottles of beer on the wall, no more bottles of beer.
    Go to the store and buy some more, 99 bottles of beer on the wall.
     */

    public static String HQ9(char code) {
        return null;
    }

    /*
    Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

            [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

     */
    public static int grow(int[] x){

        return 0;

    }

}
