package com.company.task18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String result = "";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                count++;
            }
            if(count == 1 && str.charAt(i) == 'a') {
                result = str.replace('a','o');
            }
        }

        System.out.println(result);
    }
}
