package com.pb.derkach.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PhoneBook {

    private String fio;
    private LocalDate dateOfBirth;
    private String phone;
    private String address;
    private LocalDateTime modification;

    public PhoneBook(){
    }

    public PhoneBook(String fio, LocalDate dateOfBirth, String phone, String address) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.modification = LocalDateTime.now();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
        this.modification = LocalDateTime.now();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.modification = LocalDateTime.now();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        this.modification = LocalDateTime.now();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.modification = LocalDateTime.now();
    }

    public LocalDateTime getModification() {
        return modification;
    }

    public void setMod(LocalDateTime modification) {
        this.modification = modification;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", modification=" + modification +
                '}';
    }
}