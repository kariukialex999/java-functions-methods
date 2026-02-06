package org.kariioke;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //functions/methods in java
        //functions are basically a block of code that can be reused

        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.print("The sum of the two numbers is: " + sum);
    }
}
