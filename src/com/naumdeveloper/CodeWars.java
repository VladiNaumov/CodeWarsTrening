package com.naumdeveloper;

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
        return "";
    }

}