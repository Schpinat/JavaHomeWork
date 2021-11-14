package com.pb.derkach.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
// Наследуем переменные
    public Pants (Size size, int price, String color) {
        super(size, price, color);
    }

//Реализуем метод интерфейса
    @Override
    public void dressMan() {
        System.out.println("Мужские штаны " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны " + this);
    }
}
