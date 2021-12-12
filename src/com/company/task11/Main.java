package com.company.task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();
        String symbol = in.next();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == symbol.charAt(0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
