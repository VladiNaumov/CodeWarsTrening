package com.naumdeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodeWars {


/*
Implement a function that accepts 3 integer values a, b, c.
The function should return true if a triangle can be built with the sides of given length and false in any other case.
(In this case, all triangles must have surface greater than 0 to be accepted).
*/

    public static boolean isTriangle(int a, int b, int c){
            return a + b > c && a + c > b && c + b > a;
        }


/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
You can assume that all values are integers. Do not mutate the input array/list.

*/


    public static int[] invert(int[] array) {

            for(int i = 0; i < array.length; i++) {
                array[i] *= -1;
            }
            return array;
        }

/*
    function invert(array $a): array {

        return array_map(function($x){return $x*-1;}, $a);
    }


 */

 /*
 Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

    Examples
    "This is an example!" ==> "sihT si na !elpmaxe"
    "double  spaces"      ==> "elbuod  secaps"
  */

    public static String reverseWords(final String original)
    {
        StringBuilder builder = new StringBuilder();
        String[] str = original.split(" ");
        int length = str.length;
        for(int k = 0; k<=length-1; k++)
        {
            for(int j=str[k].length()-1;j>=0;j--)
            {
                builder.append(str[k].charAt(j));
            }
            if(k<length-1) builder.append(" ");
        }

        return (length>0) ? builder.toString() : original;
    }


    /*

    This time no story, no theory. The examples below show you how to write function accum:

    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"

    The parameter of accum is a string which includes only letters from a..z and A..Z.
     */

    public static String accum(String s) {
            s = s.toLowerCase();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                builder.append(Character.toUpperCase(ch));
                for (int j = 0; j < i; j++) {
                    builder.append(ch);
                }
                builder.append("-");
            }

            return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }


    /*
    Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

        Example:
        n= 5, m=5: 25
        n=-5, m=5:  0
     */

    public static int paperWork(int n, int m)
    {
        int summa = 0;

        if(n > 0 && m > 0)
        summa = n * m;

        return summa;
    }

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
    Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
    Essentially, rearrange the digits to create the highest possible number.

    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321
     */

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
