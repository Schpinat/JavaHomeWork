package com.pb.derkach.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
// Наследуем переменные
    public Tshirt (Size size, int price, String color) {
        super(size, price, color);
    }

//Реализуем метод интерфейса
    @Override
    public void dressMan() {
        System.out.println("Мужская футболка " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка " + this);
    }
}
