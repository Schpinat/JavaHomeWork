package com.pb.derkach.hw8;

public class Auth {
    //Задаем переменные
    String login;
    String password;
    //Создаем метод регистрации пользователя
public void signUp (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
    //Создаем проверку на логин
    if(login.length() < 5 || login.length() > 20) {
        throw new WrongLoginException("Длина введенного Вами логина должна быть не меньше 5 " +
                "и не больше 20 символов.");
        }
    else if (!login.matches("^[a-zA-Z0-9]+$")) {
        throw new WrongLoginException("Логин может содержать только латинские буквы и цифры.");
    } else {
        this.login = login;
    }
    //Создаем проверку на введенный пароль
    if(!(password.length() > 5)) {
        throw new WrongPasswordException("Длина пароля должна быть более 5 символов.");
    } else if (!password.matches("^[a-zA-Z0-9_]+$")) {
        throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и знаки подчеркивания.");
    }
    //Создаем првоерку на совпадение введенного пароля
    else if (!password.matches(confirmPassword)) {
        throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
    } else {
        this.password = password;
        System.out.println("Вы успешно прошли регистрацию.");
    }
}
    //Создаем метод входа
    public void signIn (String login, String password) throws WrongLoginException {
        if(this.login != null || this.password != null) {
            if (!login.matches(this.login) || !password.matches(this.password)) {
                throw new WrongLoginException("Введены неверно логин или пароль");
            } else {
                System.out.println("Вы успешно прошли авторизацию");
            }
        }
    }
}
