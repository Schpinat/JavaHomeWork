package com.pb.derkach.hw10;

import java.util.ArrayList;
import java.util.List;

public class NumBox<T extends Number> {
    //Объявляем переменные
    private List<T> numList;
    private final int size;
    // Создаем конструктор
    public NumBox (int size) {
        this.size = size;
        numList = new ArrayList<T>(size);
    }
    // Создаем метод добавляющий число в массив. В случае если массив полон - выбросываем исключение.
    public void add(T x) {
        if (numList.size()<= size-1)
            numList.add(x);
        else throw new RuntimeException();
    }
    // СОздаем метод возвращающий количество элементов
    public int length() {
        return numList.size();
    }
    // Создаем метод для подсчета среднего арифметического среди элементов массива
    public double average(){
        double sum = 0;
        for (T x:numList) {
            sum=sum+x.doubleValue();
        }
        return sum / numList.size();
    }
    // Создаем метод для подсчета суммы всех элементов массива
    public double sum() {
        double sum = 0;
        for (T x : numList) {
            sum = sum + x.doubleValue();
        }
        return sum;
    }
    // Создаем метод поиска максимального элемента массива
    public T max () {
        T maximum = numList.get(0);
        for( int i=0;i<numList.size();i++){
            if(numList.get(i).doubleValue()>maximum.doubleValue())
                maximum=numList.get(i);
        }
        return maximum;

    }
}
