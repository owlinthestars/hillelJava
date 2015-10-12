package Another;

import java.util.Scanner;

/**
 * Created by OsadchiyO on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {
        ternariExample();

    }

    private static void ternariExample() {
        int number = 5;
        String isEven = isEven(number);

        isEven =  (number % 2 == 0) ? "yes" : "no"; //Тернарный оператор. Ternarnii Operator (sokr if else)
    }

    public static String isEven(int someNumber){
    if(someNumber % 2 == 0){
        return "yes";
    } else {
        return "no";
    }

}
    private static void switchCaseSecondExample() {
        String month = "mar";

        switch(month) {

            case "jan":
            case "feb":
            case "dec":
                System.out.println("winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("spring");
                break;
            default:
                System.out.println("wrong month name" + month);
                break;
        }
    }

    private static void switchCaseExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("Wrong month number");
                break;
            case 2:
                System.out.println("feb");
                break;
        }
    }

    private static void ifExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter here your age: ");

        int age = scanner.nextInt();
/*if and else */
        if (age < 20) {
            System.out.println("You are young");
        } else {
            if (age < 15) {
                System.out.println("You are a little boy/girl");
            } else {
                if (age < 50) {
                    System.out.println("You are not so young");
                } else {
                    System.out.println("you are oldman");
                }
            }
        }
/*A lot of if*/
        if (age >= 0 && age < 10) {
            System.out.println("kid");
        }
        if (age >= 10 && age < 20) {
            System.out.println("teen");
        }
        if (age >= 20 && age < 50) {
            System.out.println("adult");
        }
        if (age >= 50) {
            System.out.println("old");
        }
    }

    private static void ifExplanation() {
        boolean condition = true;
        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        } else {
            System.out.println("Out of IF block");
        }
    }

}
