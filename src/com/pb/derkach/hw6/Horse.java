package com.pb.derkach.hw6;

import java.util.Objects;

public class Horse extends Animal {
    // Создаем дополнительные переменные
    private String voiceHorse;
    private String nameHorse;

// Создаем конструктор

    public Horse(String food, String location, String voiceHorse, String nameHorse) {
        super(food, location);
        this.voiceHorse = voiceHorse;
        this.nameHorse = nameHorse;
    }

//Добавляем сеттеры и геттеры

    public String getVoiceHorse() {
        return voiceHorse;
    }

    public void setVoiceHorse(String voiceHorse) {
        this.voiceHorse = voiceHorse;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }
// Создаем перегруженные методы

    @Override
    public void makeNoise() {
               System.out.println(nameHorse + "... говорит " + voiceHorse);
    }

    @Override
    public void eat() {
              System.out.println(nameHorse + "... кущает " + getFood());
    }

//Перегружаем

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return voiceHorse.equals(horse.voiceHorse) && nameHorse.equals(horse.nameHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceHorse, nameHorse);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voiceDog='" + voiceHorse + '\'' +
                ", nameDog='" + nameHorse + '\'' +
                '}';
    }
    public void newCat(){
        System.out.println("Лошадка добавлена в метод");
    }
}