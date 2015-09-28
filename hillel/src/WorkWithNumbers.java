import java.util.Scanner;

/**
 * Created by Oleg on 27.09.2015.
 */
public class WorkWithNumbers {
    public static void main(String[] args){
        checkNumbers();
        nearestNumber();

        checkTheSide();

    }

    private static void checkTheSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter area of a rectangle ");
        float area = scanner.nextFloat();
        System.out.print("Please enter Perimeter of a rectangle ");
        float Perimeter = scanner.nextFloat();

        float a = (int) ((Math.sqrt(Math.pow(Perimeter, 2) - 16 * area) + Perimeter) / 4);

        float b = (area / a);

        if (2 * a + 2 * b == Perimeter) {
            System.out.println("First sides" + a );
            System.out.println("Second sides = " + b);

        }
        if(a==b){
            
            System.out.println("Your figure is square");

        } else{
            System.out.println("Rectangle with this parameters cant exist");
        }
    }

    private static void nearestNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int numberTen = 10;
        int res1 = numberTen - firstNumber;
        int res2 = numberTen - secondNumber;
        if(res1>res2){
            System.out.println("First number is nearest;");
        }
        if(res1==res2){
            System.out.println("They also are nearest;");
        }
        if(res2>res1){
            System.out.println("Second number is nearest;");
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
