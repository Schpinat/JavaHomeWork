package com.pb.derkach.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100 и нажмите Enter: ");
        String someNumber = in.nextLine();

        int number = Integer.parseInt(someNumber);

        switch (number) {
            case 0 :
                System.out.println("Вы ввели число в диапазоне от 0 до 14");
                break;
            case 100 :
                System.out.println("Вы ввели число в диапазоне от 51 до 100");
                break;
            default :
                if (number >= 1 && number <= 14)
                    System.out.println("Вы ввели число в диапазоне от 0 до 14");
                else if (number >= 15 && number <= 35)
                    System.out.println("Вы ввели число в диапазоне от 15 до 35");
                else if (number >= 36 && number <= 50)
                    System.out.println("Вы ввели число в диапазоне от 35 до 50");
                else if (number >= 51 && number <= 100)
                    System.out.println("Вы ввели число в диапазоне от 51 до 100");
                else
                    System.out.println("Вы ввели не то, что Вас просили.");
                break;
        }
    }
}

