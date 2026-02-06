package org.kariioke;

import java.util.Scanner;

public class SumFunction {

    // a function helps us to use the same block over and over again without repeating ourselves
    static void main() {
          sum();
        int ans = sum2();
        System.out.println("The sum of the two numbers is: " +ans);
    }

    static void sum () {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.print("The sum of the two numbers is: " + sum);
        System.out.println(" ");
    }


    // the return statement means the end of the program and any code after that is never executed
    static int sum2() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
       return sum;
    }
}
