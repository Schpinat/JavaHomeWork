package com.pb.derkach.hw7;

public class Skirt extends Clothes implements WomenClothes {
// Наследуем переменные
    public Skirt (Size size, int price, String color) {
    super(size, price, color);
}

//Реализуем метод интерфейса
    @Override
    public void dressWomen() {
        System.out.println("Женская юбка " + this);
    }
}
