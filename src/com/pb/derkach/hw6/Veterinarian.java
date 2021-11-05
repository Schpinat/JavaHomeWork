package com.pb.derkach.hw6;

public class Veterinarian {
    private String name;
    public Veterinarian(String name) {
        this.name = name;
    }

    private String checkAnimal(Animal animal) {
        if (animal instanceof Cat)
            return "Котик";
        if (animal instanceof Dog)
            return "Собачка";
        if (animal instanceof Horse)
            return "Лошадка";
        return "Кто здесь?";
    }

     void treatAnimal(Animal animal) {
        System.out.println(checkAnimal(animal) + " обитает в " + animal.getLocation()
                + ", кушает " + animal.getFood());
    }

    @Override
    public String toString() {
        return "*** Животные на приеме у " + name + " ***"
                ;
    }



//
//    void treatAnimal(Animal animal){
//
//        System.out.println("Кто-то скушал " + animal.getFood() + " и лечит животик");
//        System.out.println("Кто-то пришел из  " + animal.getLocation() + " на прием к ветеринару");
//    }


    }

