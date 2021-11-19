package com.pb.derkach.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        String log;
        String pass;
        String checkPass;
        Auth auth = new Auth();
        Scanner in = new Scanner(System.in);
        System.out.println("Пройдите регистрацию.");
        int count = 0;
        while (true) {
            count++;
            if (count > 3) {
                System.out.println("Превышено количество попыток.");
                System.exit(1);
            }
            System.out.println("Введите Ваш логин. Логин должен быть от 5 до 20 символов, допускаются латинские буквы и цифры: ");
            log = in.nextLine();
            System.out.println("Введите Ваш пароль. Пароль должен быть больше 5 символов, допускаются латинские буквы, цифры и знаки подчеркивания :");
            pass = in.nextLine();
            System.out.println("Подтвердите пароль: ");
            checkPass = in.nextLine();
            try {
                auth.signUp(log, pass, checkPass);
                break;
            } catch (WrongLoginException e) {
                System.out.println("Ошибка логина: " + e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println("Ошибка пароля: " + e.getMessage());
            }


            System.out.println(" ");
            System.out.println("Вход в аккаунт.");
            count = 0;
            while (true) {
                count++;
                if (count > 3) {
                    System.out.println("Превышено количество попыток");
                    System.exit(1);
                }
                System.out.println("Введите Ваш логин: ");
                log = in.nextLine();
                System.out.println("Введите Ваш пароль: ");
                pass = in.nextLine();
                try {
                    auth.signIn(log, pass);
                    break;
                } catch (WrongLoginException e) {
                    System.out.println("Ошибка входа: " + e.getMessage());
                }
            }

        }
    }
}