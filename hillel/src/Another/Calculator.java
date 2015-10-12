package Another;

import java.util.Scanner;

/**
 * Created by Oleg on 29.09.2015.
 *
 */
public class Calculator {
    public static void main(String[] args) {
        typeChecker();
        mediumOperation();
        easyOperation();


    }

    private static void typeChecker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int b = scanner.nextInt();



        if (b >= (-128) && b <= 127) {
            System.out.println("this number can be byte");
        } else {
            System.out.println("This number cant be byte");
        }
        if (b >= -32768 && b <= 32767) {
            System.out.println("this number can be short");
        } else {
            System.out.println("This number cant be short");
        }
        if (b >= -2147483648 && b <= 2147483647) {
            System.out.println("this number can be int");
        } else {
            System.out.println("This number cant be int");
        }
        if (b >= -9223372036854775808L && b <= 9223372036854775807L) {
            System.out.println("this number can be long");
        } else {
            System.out.println("This number cant be long");
        }

    }

    private static void mediumOperation() {
        double res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number a: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter operation what you want to do: ");
        String operation = scanner.nextLine();
        switch(operation){
            case "trunk":
                 res = (int) a;
                System.out.println((int)res);
                break;
            case "fract":
                res = a -( (int) a);
                System.out.println((float)res);
                break;


        }
    }

    private static void easyOperation() {
        double res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your a ");
        double a = scanner.nextDouble();
        System.out.println("Enter your b ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter what operation you want to do:");
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
            case "plus":
                 res = a + b;
                System.out.println(res);
                break;
            case "-":
            case "minus":
                res = a - b;
                System.out.println(res);
                break;
            case "*":
            case "increase":
                res = a * b;
                System.out.println(res);
                break;
            case "/":
            case "divide":
                res = a / b;
                System.out.println(res);
                break;
            default:
                System.out.println("Not easy operation for me. I'm sorry");
                break;
        }
    }
}
