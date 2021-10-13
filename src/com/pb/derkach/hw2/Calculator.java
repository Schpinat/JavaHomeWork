package com.pb.derkach.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String operand1 = in.nextLine();
        System.out.println("Вы ввели число: " + operand1);

        System.out.print("Введите второе число: ");
        String operand2 = in.nextLine();
        System.out.println("Вы ввели число: " + operand2);


        System.out.print("Введите арифметический знак между числами " + operand1 + " и " + operand2 + ": ");
        String sign = in.nextLine();
        System.out.println("Вы ввели: " + sign);
        int n1 = Integer.parseInt(operand1);
        int n2 = Integer.parseInt(operand2);


        switch (sign) {
            case "+":
                System.out.println("Ваш результат: " + (n1 + n2));
                break;

            case "-":
                System.out.println("Ваш результат: " + (n1 - n2));
                break;

            case "*":
                System.out.println("Ваш результат: " + (n1 * n2));
                break;
            case "/":
                if (n2 == 0)
                    System.out.println("Делить на ноль нельзя!");
                else
                    System.out.println("Ваш результат: " + (n1 / n2));
                break;
            default:
                System.out.println("Вас просили ввести арифметический знак!");
        }
        
    }
}
