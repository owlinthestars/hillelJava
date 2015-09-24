import java.util.Scanner;

/**
 * Created by OsadchiyO on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter here your age: ");

      int age = scanner.nextInt();
/*if and else */
        if (age <20){
            System.out.println("You are young");
        } else{
            if(age<15){
                System.out.println("You are a little boy/girl");
            }else
            {
                if (age<50){
                    System.out.println("You are not so young");
                }else {
                    System.out.println("you are oldman");
                }
            }
        }
/*A lot of if*/
        if (age >= 0 && age <10){
            System.out.println("kid");
        }
        if (age >=10 && age < 20){
            System.out.println("teen");
        }
        if (age >=20 && age < 50){
            System.out.println("adult");
        }
        if (age >=50){
            System.out.println("old");
        }
    }

    private static void ifExplanation() {
        boolean condition = true;
        if(condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        }
        else {
            System.out.println("Out of IF block");
        }
    }

}
