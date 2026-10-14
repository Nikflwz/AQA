package org.example;

public class LoginPage {
    private String username;
    private String password;

    public LoginPage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println("Попытка входа: " + username);
    }

    public boolean isPasswordValid() {
        return password != null && password.length() >= 8;
    }

    public String getUsername() {
        return username;
    }
}
