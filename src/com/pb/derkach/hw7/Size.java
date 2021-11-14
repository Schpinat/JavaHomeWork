package com.pb.derkach.hw7;

public enum Size {
// Задаем перечисления
    XXS ("Детский размер",32),
    XS ("Взрослый размер",34),
    S ("Взрослый размер",36),
    M ("Взрослый размер",38),
    L ("Взрослый размер", 40);

//Задаем переменные
private String description;
    private int euroSize;

// Создаем конструктор принимающий переменные
    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

// Создаем метод возвращющий описание
    public String getDescription() {
        return description;
    }

// Создаем метод возвращющий описание
    public int getEuroSize() {
        return euroSize;
    }
}
