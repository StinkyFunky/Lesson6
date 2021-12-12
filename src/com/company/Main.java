package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// Строки
//        String text1 = "Hello"; //вариант 1
//        String text2 = new String("Hello");// var 2 через новый объект
//
//        char[] massChar = {'W','o','r','l','d'};// через массив чаров
//        String text3 = new String(massChar);
//
//        String text4 = new String(massChar, 2,3);
//
//        String newText1 = text1 + text2;// конкатинация через +
//        StringBuilder builder = new StringBuilder();// конкатинация через +
//        StringBuilder s1 = builder.append(text1).append(text2);
//        String s = s1.toString();
//
//        String name = "Jack Sparrow";
//        char c = name.charAt(3);//возвращает символ по индексу
//        System.out.println(c);
//        // equals - сравнивает значение == сравновает ссылки
//        text1.equals(text2);// Сравнивает значение объектов
//        System.out.println(Objects.equals(text1, text2));// методы курсивом являются static
//
//
//        System.out.println("text1: " + text1);
//        System.out.println("text2: " + text2);
//        System.out.println("text3: " + text3);
//        System.out.println("text4: " + text4);
//        System.out.println("text4: " + text4);
//
//        System.out.println(text2.equals(text1));

//        String text1 = "Hello";
//        String text2 = "  hello  ";
//
//        System.out.println(text1.equalsIgnoreCase(text2));// сравнение без учета регистра
//        System.out.println(text1.length());
//        text2.trim();// убирает пробелы с начала и конца
//
//        int a = 145;
//        String number = String.valueOf(a);
//
//        System.out.println(Objects.equals(text1, text2));

        String text1 = "25F";
        float age = Float.parseFloat(text1);

        long money = 2_000_000L;
        int wall = (int) money;

        System.out.println(money);
        System.out.println(age);
    }
}
