package com.pb.derkach.hw6;
import java.util.Objects;

public class Dog extends Animal {
// Создаем дополнительные переменные
    private String voiceDog;
    private String nameDog;

// Создаем конструктор

    public Dog(String food, String location, String voiceDog, String nameDog) {
        super(food, location);
        this.voiceDog = voiceDog;
        this.nameDog = nameDog;
    }
//Добавляем сеттеры и геттеры

    public String getVoiceDog() {
        return voiceDog;
    }

    public void setVoiceDog(String voiceDog) {
        this.voiceDog = voiceDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    // Создаем перегруженные методы
    @Override
    public void makeNoise() {
               System.out.println(nameDog +  "... говорит " + voiceDog);
    }

    @Override
     public void eat () {
                System.out.println(nameDog + "... кущает " + getFood());
    }

//Перегружаем
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dog dog = (Dog) o;
    return voiceDog.equals(dog.voiceDog) && nameDog.equals(dog.nameDog);
}

    @Override
    public int hashCode() {
        return Objects.hash(voiceDog, nameDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voiceDog='" + voiceDog + '\'' +
                ", nameDog='" + nameDog + '\'' +
                '}';
    }
    public void newDog(){
        System.out.println("Собачка добавлена в метод");
    }
}
