package org.example;

public class JavaMain {
    public static void main(String[] args) {

        User user1 = new User("Никита", 23);
        User user2 = new User("Никита", 17);

        user1.introduce();
        System.out.println(user1.isAdult() + "\n");

        user2.introduce();
        System.out.println(user2.isAdult() + "\n");

        LoginPage test1 = new LoginPage("standard_user", "secret123");
        LoginPage test2 = new LoginPage("test_user", "abc");
        LoginPage test3 = new LoginPage("null_user", null);

        System.out.println(test1.getUsername());
        test1.login();
        System.out.println(test1.isPasswordValid() + "\n");

        System.out.println(test2.getUsername());
        test2.login();
        System.out.println(test2.isPasswordValid() + "\n");

        System.out.println(test3.getUsername());
        test3.login();
        System.out.println(test3.isPasswordValid());
    }
}
