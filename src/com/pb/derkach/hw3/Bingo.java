package com.pb.derkach.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        // Загадываем рандомное число:
        Random random = new Random();
        int secret_number = random.nextInt(101);
        // Вводим счетчик попыток:
        int attempt = 1;

        //Проверка загаданного числа:
        System.out.println("Подсказка для админа: загадано число " + secret_number + ".");

        Scanner sc = new Scanner(System.in);
        System.out.println("Мы загадали число от 0 до 100. Попробуйте его отгадать. Введите свое число и нажмите Enter.");
        System.out.println("Для выхода из программы введите - 999.");
        int enter_number = sc.nextInt();

        while (enter_number != secret_number) {
            attempt++;

            if (enter_number == 999) {
                attempt--;
                attempt--;
                break;
            }
            if (enter_number>secret_number) {
                System.out.println("Упс... Введенное Вами число "+ enter_number + " больше чем загаданное. Ещё разок?");
            }
            if (enter_number<secret_number) {
                System.out.println("Упс... Введенное Вами число "+ enter_number + " меньше чем загаданное. Ещё разок?");
            }
            enter_number = sc.nextInt();
        }
        System.out.println("Было загадано число " + secret_number + ". Вы потратили "+ attempt + " попыток/попытки!");
        System.out.println("Конец игры!");
    }
}
