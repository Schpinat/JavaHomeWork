package com.pb.derkach.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String phoneBookJson;
        int index;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());

        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);


        List<PhoneBook> phoneBookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("ТЕЛЕФОННЫЙ СПРАВОЧНИК");
            System.out.println("-----------------------------------------------");
            System.out.println("1) Вывести на экран данные справочник");
            System.out.println("2) Добавление записи");
            System.out.println("3) Удаление записи");
            System.out.println("4) Найти запись");
            System.out.println("5) Отсортировать по ФИО");
            System.out.println("6) Отредактировать запись");
            System.out.println("7) Записать в файл");
            System.out.println("8) Загрузить из файла все записи");
            System.out.println("0. Выйти из справочника");

            String option = scan.next();

            switch (option) {
                case "1":
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "2":
                    phoneBookList.add(addElement(scan));
                    System.out.println("Успешно добавлена запись");
                    break;

                case "3":
                    System.out.println("Введите индекс записи для удаления: ");
                    index = getIndex(scan);
                    phoneBookList.remove(index);
                    System.out.println("Запись под индексом " + index + " удалена.");
                    break;

                case "4":
                    System.out.println("Введите индекс записи для поиска: ");
                    index = getIndex(scan);
                    phoneBookJson = mapper.writeValueAsString(phoneBookList.get(index));
                    System.out.println(phoneBookJson);
                    break;

                case "5":
                    TreeSet<PhoneBook> fioCompar = new TreeSet<>(new Comparator<PhoneBook>() {
                        @Override
                        public int compare(PhoneBook a, PhoneBook b) {
                            return a.getFio().compareTo(b.getFio());
                        }
                    });
                    fioCompar.addAll(phoneBookList);

                    phoneBookJson = mapper.writeValueAsString(fioCompar);
                    System.out.println(phoneBookJson);
                    break;


                case "6":
                    edit(scan, phoneBookList);
                    break;

                case "7":
                    FileWriter file = new FileWriter("phonebook.json");
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    file.append(phoneBookJson);
                    file.flush();
                    file.close();

                    System.out.println("Запись в файл завершена.");
                    break;

                case "8":
                    phoneBookList = new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("phonebook.json").toFile(), PhoneBook[].class)));
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "0":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Ошибка ввода выбора действия.");
            }
        }

    }

    private static PhoneBook addElement(Scanner scan) {
        String str = scan.nextLine();
        System.out.println("Введите ФИО: ");
        String fio = scan.nextLine();

        System.out.println("Введите дату рождения в формате dd/MM/yyyy: ");
        LocalDate dateOfBirth = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Введите телефон: ");
        String phone = scan.nextLine();

        System.out.println("Введите адрес: ");
        String address = scan.nextLine();

        PhoneBook phoneBook = new PhoneBook(fio, dateOfBirth, phone, address);
        return phoneBook;
    }

    private static int getIndex(Scanner scan) {
        return scan.nextInt();
    }

    private static String scanner(Scanner scan) {
        String str = scan.nextLine();
        return scan.nextLine();
    }

    private static void edit(Scanner scan, List<PhoneBook> phoneBookList) {

        System.out.println("Введите индекс записи для редактирования: ");
        int index = getIndex(scan);
        PhoneBook phoneBook = phoneBookList.get(index);

        System.out.println();
        System.out.println("1. Редактировать ФИО");
        System.out.println("2. Редактировать дату рождения");
        System.out.println("3. Редактировать телефон");
        System.out.println("4. Редактировать адрес");
        System.out.println("0. Главное меню");

        String option = scan.next();

        switch (option) {
            case "1":
                System.out.println("Введите новое ФИО:");
                phoneBook.setFio(scanner(scan));
                break;
            case "2":
                System.out.println("Введите новую дату в формате dd/MM/yyyy :");
                phoneBook.setDateOfBirth(LocalDate.parse(scanner(scan), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                break;
            case "3":
                System.out.println("Введите номер телефона:");
                phoneBook.setPhone(scanner(scan));
                break;
            case "4":
                System.out.println("Введите новый адрес:");
                phoneBook.setAddress(scanner(scan));
                break;
            case "0":
                break;
            default:
                System.out.println("Ошибка ввода выбора действия.");
        }
        phoneBookList.set(index, phoneBook);
        if (!option.equals("0")) {
            System.out.println("Данные отредактированы");
        }
    }
}