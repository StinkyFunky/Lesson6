package com.company.task21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();

        simpleCalculator(a, operator.charAt(0), b);
    }

    public static void simpleCalculator(int a, char operator, int b) {

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong operation!");
        }
    }
}
