import java.util.Scanner;

/**
 * Created by Oleg on 27.09.2015.
 */
public class WorkWithNumbers {
    public static void main(String[] args){
        checkNumbers();
        nearestNumber();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter area of a rectangle ");
        int area = scanner.nextInt();
        System.out.print("Please enter Perimeter of a rectangle ");
        int Perimeter = scanner.nextInt();

        int a = (int) ((Math.sqrt(Math.pow(Perimeter, 2) - 16 * area) + Perimeter) / 4);

        int b = (area / a);

        if (2 * a + 2 * b == Perimeter) {
            System.out.println("First sides" + a );
            System.out.println("Second sides = " + b);

        } else if(a==b){
            System.out.println("Your figure is square");

        } else{
            System.out.println("Rectangle with this parameters cant exist");
        }

    }

    private static void nearestNumber() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = scanner.nextInt();

        int constantNumber = 10;
        int res1 = constantNumber - number1;


        int res2 = constantNumber - number2;

        if (res1 < res2) {
            System.out.println("First number nearest");
        } else if (res1 == res2) {
            System.out.println("They also nearest");
        } else {
            System.out.println("Second number nearest ");
        }
    }

    private static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number?: ");

        float number = scanner.nextFloat();

        if (number % 2 == 0) {
           System.out.println("You entered even number");
       } else if (number % 2 !=0){
           System.out.println("You entered fractional number ");
       } else {
            System.out.println("You entered odd number");
        }
    }
}
