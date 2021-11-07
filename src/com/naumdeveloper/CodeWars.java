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

    /*
    6ku
    Consider the function

    f: x -> sqrt(1 + x) - 1 at x = 1e-15.

    We get: f(x) = 4.44089209850062616e-16

    or something around that, depending on the language.

    This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region. Using pow instead of sqrt doesn't give better results.

    A "good" answer is 4.99999999999999875... * 1e-16.

    Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?

    Note:
    Don't round or truncate your results. See the testing function in Sample Tests:.
     */

    public static double f(double x) {
        // your code
        return 0.0;
    }

    /*
    Removed due to copyright infringement.
     */

    public static String SongDecoder (String song)
    {
        // Your code is here...
        return "";
    }

    /*
    6 KU
    You live in the city of Cartesia where all roads are laid out in a perfect grid.
    You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
    The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
    You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point.
    Return false otherwise.

    Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only).
    It will never give you an empty array (that's not a walk, that's standing still!).
     */

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        return true;
    }

    /*
    6KU
    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
    which is the number of times you must multiply the digits in num until you reach a single digit.

    For example:

     persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                          // and 4 has only one digit

     persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                           // 1*2*6 = 12, and finally 1*2 = 2

     persistence(4) == 0 // because 4 is already a one-digit number
     */

    public static int persistence(long n) {
        // your code

        return 0;
    }

    /*
    Well met with Fibonacci bigger brother, AKA Tribonacci.

    As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it,
    regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(

    So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:

    [1, 1 ,1, 3, 5, 9, 17, 31, ...]
    But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place,
    you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:

    [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
    Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list,
    returns the first n elements - signature included of the so seeded sequence.

    Signature will always contain 3 numbers; n will always be a non-negative number;
    if n == 0, then return an empty array (except in C return NULL) and be ready for anything else which is not clearly specified ;)

    If you enjoyed this kata more advanced and generalized version of it can be found in the Xbonacci kata

    [Personal thanks to Professor Jim Fowler on Coursera for his awesome classes that I really recommend to any math enthusiast and for showing me this mathematical curiosity too with his usual contagious passion :)]
     */

    public double[] tribonacci(double[] s, int n) {

        double array [] = new double[10];

        return  array;
    }

    /*
    6KU
    A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
    the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
    because it uses the letters A-Z at least once (case is irrelevant).

    Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     */

    public boolean check(String sentence){

        return true;
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
    Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
    You can guarantee that input is non-negative.

    Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
     */

    public static int countBits(int n){
        // Show me the code!
        return 0;
    }
}
