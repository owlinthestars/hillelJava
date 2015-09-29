import java.util.Scanner;
/**
 * Created by Oleg on 29.09.2015.
 *
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your a ");
        double a = scanner.nextDouble();
        System.out.println("Enter your b ");
        double b = scanner.nextDouble();
        System.out.println("Enter what operation you want to do:");
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
                double res = a + b;
                System.out.println(res);
                break;
            case "-":
                res = a - b;
                System.out.println(res);
                break;
            case "*":
                res = a * b;
                System.out.println(res);
                break;
            case "/":
                res = a / b;
                System.out.println(res);
                break;
            case "plus":
                res = a + b;
                System.out.println(res);
                break;
            case "minus":
                res = a - b;
                System.out.println(res);
                break;
            case "increase":
                res = a * b;
                System.out.println(res);
                break;
            case "divide":
                res = a / b;
                System.out.println(res);
                break;

        }


    }
}
