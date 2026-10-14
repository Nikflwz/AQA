package org.example;

public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Имя: " + username);
        System.out.println("Возраст: " + age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

}
