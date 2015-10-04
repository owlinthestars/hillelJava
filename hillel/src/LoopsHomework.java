
import java.util.Scanner;
import java.util.Random;


/**
 * Created by Oleg on 03.10.2015.
 */
public class LoopsHomework {
    public static void main(String[] args) {

        String message;
        char key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message ");
        message = scanner.nextLine();
        System.out.println("Enter your key ");
        key = scanner.next().charAt(0);

        System.out.println("It's a default message:");
        System.out.println(message);

        String cryptedString = crypt(message, key, true);
        System.out.println("It's a crypted message:");
        System.out.println(cryptedString);

        String uncryptedString = crypt(cryptedString, key, false);
        System.out.println("It's a decrypted message:");
        System.out.println(uncryptedString);
    }

    public static String crypt(String message, char key, boolean code) {
        char[] charMessage = message.toCharArray();
        int cryptedChar;
        char[] cryptedCharArray = new char[charMessage.length];
        if (code) {
            for (int i = 0; i < charMessage.length; i++) {
                cryptedChar = (charMessage[i] ^ key) + 33;
                cryptedCharArray[i] = (char) cryptedChar;
            }
        }else{
            for (int i = 0; i < charMessage.length; i++) {
                cryptedChar = (charMessage[i] - 33) ^ key;
                cryptedCharArray[i] = (char) cryptedChar;
            }
        }
        return String.copyValueOf(cryptedCharArray);
    }




    private static void randomNumber() {
        Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        int d;
        int c = random.nextInt();
        do{
        System.out.println("Enter please the number: ");
         d = scanner.nextInt();

            if( c < d){
                System.out.println("your number is greater");
            }else {
                System.out.println("your number is lesser ");
            }
        }while(d!=c);
        System.out.println("GG YOU WIN");
        System.out.println(d);
    }

    private static void Deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your money: ");
        int money =  scanner.nextInt();
        System.out.println("Enter the number of month, when you need to get back your money: ");
        int deadlineMonth = scanner.nextInt();
        int month = 0;
        System.out.println("Enter the max value of the money: ");
        int maxMoney = scanner.nextInt();
        while(money < maxMoney){
           money+=0.03F*money;
            month++;
            while(month <= deadlineMonth){
                month++;

            }

        }
        System.out.println("Your money this month is : " + money);
        System.out.println("Your max value of money: " + maxMoney+ " " + "You need " + month + " month " + "for it;");
    }
}

