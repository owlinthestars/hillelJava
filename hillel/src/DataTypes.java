/**
 * Created by OsadchiyO on 24.09.2015.
 */
public class DataTypes {
    public static void main (String[] args) {
        int days = 365;
        int hours = days * 24;
        int seconds = hours * 3600;
        long milliseconds = seconds * 1000L;
        long longSeconds = (milliseconds / 1000);

        System.out.println(milliseconds);

        boolean bool = true;
        bool = false;

        String s = "hello world";
        char c = 'h';

        byte b = 125;
    }
}
