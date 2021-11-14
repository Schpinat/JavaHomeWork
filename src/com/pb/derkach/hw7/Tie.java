package com.pb.derkach.hw7;

public class Tie extends Clothes implements ManClothes {
// Наследуем переменные
public Tie (Size size, int price, String color) {
    super(size, price, color);
}

//Реализуем метод интерфейса
    @Override
    public void dressMan() {
        System.out.println("Мужской галстук " + this);
    }
}
