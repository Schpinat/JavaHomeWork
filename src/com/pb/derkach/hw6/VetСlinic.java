package com.pb.derkach.hw6;


public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Animal[] animal = new Animal[3];

        animal[0] = new Dog ("Мясо","Будке","Гав-гав", "Тузик");
        animal[1] = new Cat ("Молочко","Кресле","Мяу-мяу", "Мурзик");
        animal[2] = new Horse ("Сено","Стойле","Иго-го", "Резвый");

// Рефлексия
        Class clazz = Class.forName("com.pb.derkach.hw6.Veterinarian");
        Object obj = clazz.getConstructor(new Class[]{String.class}).newInstance("Ай-болита");
        if (obj instanceof Veterinarian) {
            System.out.println(obj);
            for (Animal animals : animal) {
                ((Veterinarian) obj).treatAnimal(animals);
            }
        }
        }

    }

