package org.kariioke;

public class StringReturnType {
    static void main() {
        String message = greetings();
        System.out.println(message);
    }

    static String greetings() {
        return "Hello World!";
    }
}
