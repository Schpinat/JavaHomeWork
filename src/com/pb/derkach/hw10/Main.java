package com.pb.derkach.hw10;

import java.util.Random;

public class Main {
    public static void main (String args[]) {
        // Создаем объект Integer
        NumBox<Integer> a = new NumBox<Integer>(3);
        Random rand = new Random();
        // Объявляеи и инициализируем рандомные переменнные (Integer)
        int i1 =    rand.nextInt(100)/3;
        int i2 =    rand.nextInt(100)/3;
        int i3 =    rand.nextInt(100)/3;
        // Добавляем переменные в массив и вызываем методы
        try {
            a.add(i1);
            a.add(i2);
            a.add(i3);
        } catch (Exception e) {
        // Выводим исключение в случае переполнения массива Integer
            System.out.print("Массив Integer полон. Всего было добавлено: " + a.length());
        }
        System.out.println("Размер массива Integer сотавляет: " + a.length());
        System.out.println("Среднее значение массива Integer сотавляет: " + a.average());
        System.out.println("Сумма массива Integer сотавляет: " + a.sum());
        System.out.println("Максимальное значение массив Integer сотавляет: " + a.max());
        System.out.println("-----------------------------------------------------------------------------");
        // Создаем объект Float
        NumBox<Float> b = new NumBox<Float>(3);
        // Объявляеи и инициализируем рандомные переменнные (Float)
        float f1 = rand.nextFloat()*3;
        float f2 = rand.nextFloat()*3;
        float f3 = rand.nextFloat()*3;
        // Добавляем переменные в массив и вызываем методы
        try {
            b.add(f1);
            b.add(f2);
            b.add(f3);
        // Выводим исключение в случае переполнения массива Float
        } catch (Exception e) {
            System.out.printf("Массив Float полон. Всего было добавлено %s элемента.\n", b.length());
        }
        System.out.println("Размер массива Float составляет: " + b.length());
        System.out.println("Среднее значение массива Float составляет: " + b.average());
        System.out.println("Сумма массива Float составляет: " + b.sum());
        System.out.println("Максимальное значение массива Float составляет: " + b.max());
    }
}
