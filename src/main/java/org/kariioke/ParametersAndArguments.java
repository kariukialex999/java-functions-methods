package org.kariioke;

import java.util.Scanner;

public class ParametersAndArguments {
    static void main() {
        //we can pass the values of the numbers we want to work on as we call the function
        int result = sum(2,7);
        System.out.println(result);
    }

//    static int sum1() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int firstNum = scanner.nextInt();
//        System.out.println("Enter the second number: ");
//        int secondNum = scanner.nextInt();
//        int sum = firstNum + secondNum;
////        System.out.println("The sum of the two numbers is: " + sum);
//        return sum;
//    }
/*
although used interchangably, parameters are the placeholders while arguments are the actual values used 
when calling the function.
    */
    static int sum(int i, int j) {
        int sum = i + j;
        return sum;
    }
}
