package com.naumdeveloper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5, 6 , 7 ,7 };

        String str = Arrays.toString(CodeWars.invert(myIntArray));

        System.out.println(str);

    }
}
