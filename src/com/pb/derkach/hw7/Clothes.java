package com.pb.derkach.hw7;

public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("размер: %s (%d), цена: %d, цвет: %s",
                size, size.getEuroSize(), price, color );
    }
}
