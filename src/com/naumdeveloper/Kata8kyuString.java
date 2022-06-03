package com.naumdeveloper.codewars;

public class Kata8kyuString {
    public static void main(String[] args) {

    }

    /*
     Task1:
     int to string
     */

    public static String numberToString(int num) {
        String i = Integer.toString(num);
        return i;
    }

    /*
    Task2:
    Take 2 strings s1 and s2 including only letters from ato z.
    Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

        Examples:
        a = "xyaabbbccccdefww"
        b = "xxxxyyyyabklmopq"
        longest(a, b) -> "abcdefklmopqwxy"

        a = "abcdefghijklmnopqrstuvwxyz"
        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
     */


    public static String longest (String s1, String s2) {
        String out = "";
        String s = s1 + s2;
        for (char c = 'a'; c <= 'z'; c++)
        {
            if (s.contains(c + ""))
            {
                out += c;
            }
        }
        return out;
    }

    public static String longest_2 (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }

        /*
        Task3:
        Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
        The output should be two capital letters with a dot separating them.

        It should look like this:
                Sam Harris => S.H
                Patrick Feeney => P.F
         */

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    /*
    Task4:
         Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
     */

    static String removeExclamationMarks(String s) {
        return (s == null) ? null : s.replace("!", "");
    }

    /*
    Task5:
        Your goal is to return multiplication table for number that is always an integer from 1 to 10.
        For example, a multiplication table (string) for number == 5 looks like below:

        1 * 5 = 5
        2 * 5 = 10
        3 * 5 = 15
        4 * 5 = 20
        5 * 5 = 25
        6 * 5 = 30
        7 * 5 = 35
        8 * 5 = 40
        9 * 5 = 45
        10 * 5 = 50
        P. S. You can use \n in string to jump to the next line.

        Note: newlines should be added between rows, but there should be no trailing newline at the end.
     */

    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + (i * num) + ((i < 10) ? "\n" : "");
        }
        return result;
    }

    /*
    Task6:
    Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".

     [Make sure you type the exact thing I wrote or the program may not execute properly]
     */

    public static String greetFormat(String name)
    {
        return String.format("Hello, {0} how are you doing today?", name);
        // return "Hello, " + name + " how are you doing today?";
    }

}
