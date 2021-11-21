package com.pb.derkach.hw9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    // Создаем метод, в котором создаем файл и наполняем его массивом чисел
    public  static void createNumbersFile() throws IOException {
        Random random = new Random();
        Path createNumbersFile = Files.createFile(Paths.get(
                "D:\\JAVA\\Derkach\\JavaHomeWork\\src\\com\\pb\\derkach\\hw9\\numbers.txt"
        ));

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(createNumbersFile);
        for (int i = 0; i < array.length; i++)
            if (i % 10 == 0 && i != 100 && i != 0) {
                bufferedWriter.write("\n" + array[i] + " ");
            } else
                bufferedWriter.write(array[i] + " ");
        bufferedWriter.close();
    }

    //Создаем метод, в котором из ранее созданного файла вычитываем массив чисел и преобразуем его с записью в новый файл
    public static void createOddNumbersFile() throws IOException {
        Path changeNumbersFile = Paths.get(
                "D:\\JAVA\\Derkach\\JavaHomeWork\\src\\com\\pb\\derkach\\hw9\\numbers.txt"
        );
        Scanner read = new Scanner(changeNumbersFile);
        int n = 0;
        while(read.hasNextInt()) {
            n++;
            read.nextInt();
        }
        int[] nums = new int[n];
        Scanner read2 = new Scanner(changeNumbersFile);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = read2.nextInt();
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = 0;
        }
        read.close();
        read2.close();

        Path newPath = Files.createFile(Paths.get(
                "D:\\JAVA\\Derkach\\JavaHomeWork\\src\\com\\pb\\derkach\\hw9\\odd_numbers.txt"
        ));
        BufferedWriter changeNumbersFile1 = Files.newBufferedWriter(newPath);
        for  (int i = 0; i < nums.length; i++)
            if (i % 10 == 0 && i != 100 && i != 0) {
                changeNumbersFile1.write("\n" + nums[i] + " ");
            } else
                changeNumbersFile1.write(nums[i] + " ");
        changeNumbersFile1.close();
        System.out.println ("Files created");


    }
    //Демонстрируем работу методов
    public static void main (String args[]) {
        try {
            createNumbersFile();
            createOddNumbersFile();
        } catch (Exception e) {
            System.err.println("Error in creating files");

        }

    }
}
