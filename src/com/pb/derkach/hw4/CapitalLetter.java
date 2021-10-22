package com.pb.derkach.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {

//Предлагаем пользователю ввести предложение:
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое предложение, в котором есть слова в которых первые буквы в нижнем регистре: ");
        String enteredString = in.nextLine();

        //String result = ""; // Создаем переменную в которую перезапишем результат трансформации
        String[] parts = enteredString.split(" "); // Разбиваем предложение на отдельные слова
        upper(parts); // Передаем массив в отдельный метод для обработки
// Создаем отдельный метод, в котором будем менять первый символ слова
    }
public static void upper (String [] parts) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < parts.length; i++) {
        result.append(parts[i].replaceFirst(parts[i].charAt(0) + "", Character.toUpperCase(parts[i].charAt(0)) + "")).append(" ");
    }
    System.out.println("Ваше преобразованное предложение: ");
    System.out.println(result);
    }
}

