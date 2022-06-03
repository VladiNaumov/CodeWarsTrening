package com.naumdeveloper.codewars;

public class Kata8kyuArray {
    public static void main(String[] args) {

    }

     /*
    Task1:
    Convert number to reversed array of digits
    Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

    Example:
    348597 => [7,9,5,8,4,3]
     */

    public static int[] digitize(long n) {
        String a = Long.toString(n);
        int length = a.length();
        int[] array = new int[length];
        for ( int i = 0; i < length; i++){
            array[i] = (int) (a.charAt(length - i - 1)) - 48;
        }
        return array;
    }

    /*
    Task2:
    Issue
        Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
        The pipes connecting your level's stages together need to be fixed before you receive any more complaints. Each pipe should be connecting, since the levels ascend, you can assume every number in the sequence after the first index will be greater than the previous and that there will be no duplicates.

        Task
        Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

        Example
        Input: 1,3,5,6,7,8

        Output: 1,2,3,4,5,6,7,8
     */

    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = i + min;
        }
        return result;

    }

    /*
    Task3:
        Bob is bored during his physics lessons so he's built himself a toy box to help pass the time.
        The box is special because it has the ability to change gravity.

        There are some columns of toy cubes in the box arranged in a line.
        The i-th column contains a_i cubes. At first, the gravity in the box is pulling the cubes downwards.
        When Bob switches the gravity, it begins to pull all the cubes to a certain side of the box, d, which can be either 'L' or 'R' (left or right). Below is an example of what a box of cubes might look like before and after switching gravity.

        +---+                                       +---+
        |   |                                       |   |
        +---+                                       +---+
        +---++---+     +---+              +---++---++---+
        |   ||   |     |   |   -->        |   ||   ||   |
        +---++---+     +---+              +---++---++---+
        +---++---++---++---+         +---++---++---++---+
        |   ||   ||   ||   |         |   ||   ||   ||   |
        +---++---++---++---+         +---++---++---++---+
        Given the initial configuration of the cubes in the box, find out how many cubes are in each of the n columns after Bob switches the gravity.

        Examples:

        flip('R', {3, 2, 1, 2})     =>  {1, 2, 2, 3}
        flip('L', {1, 4, 5, 3, 5})  =>  {5, 5, 4, 3, 1}
     */

    public static int[] flip(char dir, int[] a) {
        if(dir == 'R')
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a.length - i - 1; j++)
                    if (a[j] > a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }

        if(dir == 'L')
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a.length - i - 1; j++)
                    if (a[j] < a[j+1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }

        return a;
    }

    /*
    Task4:
    Your task is to find the first element of an array that is not consecutive.
    By not consecutive we mean not exactly 1 larger than the previous element of the array.
    E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.
    If the whole array is consecutive then return null2.
    The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be pos
     */

    static Integer find(final int[] array) {
        for(int i = 1; i < array.length; ++i)
        {
            if(array[i] - array[i - 1] != 1)
            {
                return array[i];
            }
        }
        return null;
    }



    /*
    Task5:
    Create a function with two arguments that will return an array of the first (n) multiples of (x).

        Assume both the given number and the number of times to count will be positive numbers greater than 0.
        Return the results as an array (or list in Python, Haskell or Elixir).

        Examples:
        countBy(1,10)  should return  {1,2,3,4,5,6,7,8,9,10}
        countBy(2,5)  should return {2,4,6,8,10}
     */

    public static int[] CountBy(int x, int n)
    {
        int[] z = new int[n];
        for (int k = 0; k < n; k++) {
            z[k] = (k + 1) * x;
        }
        return z;
    }

}
