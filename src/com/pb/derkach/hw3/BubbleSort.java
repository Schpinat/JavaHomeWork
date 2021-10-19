package com.pb.derkach.hw3;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Создайте массив данных в количестве 10 элементов, а мы попробуем их отсортировать от меньшего к большему.");
        System.out.println("Введите по-очередно значение каждого из 10-ти элементов массива.");
// Предлагаем пользователю ввести элементы в массив
        int[] array = new int[10];
        for (int і = 0; і < array.length; і++) {
            array[і] = sc.nextInt() ;

        }
        System.out.println("Вы ввели вот такие элементы массива:");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }

        bubbleSort(array);
// Выводим пользователю отсортированный массив
        System.out.println();
        System.out.println("Получите Ваш отсортированный массив от меньшего к большему:");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }

    }

    public static void bubbleSort(int[] num) {
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];         // меняем элементы местами
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
    }
}
