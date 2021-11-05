package com.pb.derkach.hw6;

import java.util.Objects;

public class Cat extends Animal{
// Создаем дополнительные переменные
    private String voiceCat;
    private String nameCat;
// Создаем конструктор


    public Cat(String food, String location, String voiceCat, String nameCat) {
        super(food, location);
        this.voiceCat = voiceCat;
        this.nameCat = nameCat;
    }

//Добавляем сеттеры и геттеры

    public String getVoiceCat() {
        return voiceCat;
    }

    public void setVoiceCat(String voiceCat) {
        this.voiceCat = voiceCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

// Создаем перегруженные методы
    @Override
    public void makeNoise() {
               System.out.println(nameCat +  "... говорит " + voiceCat);
    }

    @Override
    public void eat () {
                System.out.println(nameCat + "... кущает " + getFood());
    }

//Перегружаем
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return voiceCat.equals(cat.voiceCat) && nameCat.equals(cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceCat, nameCat);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voiceDog='" + voiceCat + '\'' +
                ", nameDog='" + nameCat + '\'' +
                '}';
    }
    public void newCat(){
        System.out.println("Кошечка добавлена в метод");
    }
}
