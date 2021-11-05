package com.pb.derkach.hw6;

public class Animal {
   private String food;
   private String location;

// Создаем конструктор
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public Animal (){
    }

//Добавляем сеттеры и геттеры
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
// Создаем методы
    public void makeNoise () {
        System.out.println("Дурачимся...");
    }

    public void eat () {
        System.out.println("Кушаю..." + food);
    }

    public void sleep () {
        System.out.println("Кто-то спит в " + location);
    }
}
