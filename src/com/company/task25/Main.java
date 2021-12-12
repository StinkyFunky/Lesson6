package com.company.task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for(String value: str.split(" ")){
            result.append(Character.toUpperCase(value.charAt(0)));
            result.append(value.substring(1));
            result.append(" ");
        }
        result.deleteCharAt(str.length());

        System.out.println(result);
    }
}
