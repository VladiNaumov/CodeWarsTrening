package com.naumdeveloper;

import java.util.ArrayList;

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

    public static String accum(String s)
    This time no story, no theory. The examples below show you how to write function accum:

    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"

    The parameter of accum is a string which includes only letters from a..z and A..Z.
     */

    public static String accum(String s) {

        char[] c_arr = s.toCharArray();

        ArrayList<Character>summa = new ArrayList<>();

        for(int i = 0; i < c_arr.length; i++) {
            summa.add(c_arr[i]);

            for(int j = 0; j < i; j++)
                summa.add(c_arr[i]);

          //  summa.add('-');
        }

        StringBuilder builder = new StringBuilder(summa.size());
        for (Character ch: summa){
            builder.append(ch);

        }

            return builder.toString();
    }

}
