package com.pb.derkach.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // ЗАДАЧА:
// Дать пользователю ввести первое предложение (используем класс Сканнер)
// Дать пользователю ввести второе предложение
// Использовать метод для сопоставления букв слов первого и второго предложения для проверки соответствия
// Пример анаграммы :   Я, в мире сирота. -> Я в Риме — Ариост.?!
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое предложение: ");

        String first = in.nextLine().toUpperCase();
        String noSpace = first.replace(" ", "");
        String noDot = noSpace.replace(".", "");
        String noComma = noDot.replace(",", "");
        String noHyphen = noComma.replace("-", "");
        String noMark = noHyphen.replace("-", "");
        String noQuestion  = noMark.replace("-", "");

        System.out.print("Введите второе предложение: ");

        String second = in.nextLine().toUpperCase();
        String noSpace1 = first.replace(" ", "");
        String noDot1 = noSpace1.replace(".", "");
        String noComma1 = noDot1.replace(",", "");
        String noHyphen1 = noComma1.replace("-", "");
        String noMark1 = noHyphen1.replace("-", "");
        String noQuestion1  = noMark1.replace("-", "");

        System.out.println("Результат проверки на анаграму: " + isAnagram(noQuestion,noQuestion1));

        System.out.println(noQuestion);
        System.out.println(noQuestion1);

    }

    public static boolean isAnagram (String s1, String s2) {
    if (s1.length()!=s2.length())
    {return false;
    }
        char [] firstArr= s1.toCharArray();
        char [] secondArr= s2.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        String sc1 = new String(firstArr);
        String sc2 = new String(secondArr);
        return sc1.equals(sc2);
        }
    }



