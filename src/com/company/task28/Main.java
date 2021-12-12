package com.company.task28;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = "";
        String[] str = text.split(" ");

        for(int i = 0; i < str.length; i++) {
            switch (str[i].toLowerCase()) {
                case "zero":
                    result += '0' + " ";
                    break;
                case "one":
                    result += '1' + " ";
                    break;
                case "two":
                    result += '2' + " ";
                    break;
                case "three":
                    result += '3' + " ";
                    break;
                case "four":
                    result += '4' + " ";
                    break;
                case "five":
                    result += '5' + " ";
                    break;
                case "six":
                    result += '6' + " ";
                    break;
                case "seven":
                    result += '7' + " ";
                    break;
                case "eight":
                    result += '8' + " ";
                    break;
                case "nine":
                    result += '9' + " ";
                    break;
                default:
                    result += str[i] + " ";
            }
        }

        System.out.println(result);
    }
}
