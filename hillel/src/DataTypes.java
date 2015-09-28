/**
 * Created by OsadchiyO on 24.09.2015.
 */
public class DataTypes {
    public static void main (String[] args) {
        byte b = 120;
        short s = b;
        long l = s;

        double d = l; //Возможна потеря точности.Missing tochnost'

        l = 15;
        int maxValue  = Integer.MAX_VALUE;
        System.out.println("Max value " + maxValue);
        long intMaxValue = maxValue;
        long intOverflow = intMaxValue + 1;
        int i = (int) intOverflow;//Удаляет старшие биты. bad idea
        System.out.println("overflow " + i);
        d = Math.PI;

        i = (int) d;
        System.out.println(i);




    }



    private static void realNumberComparison() {
        if(1.1 + 2.2 == 3.3){
            System.out.println("they are equal");
        }else {
            System.out.println("they aren't equal");
        }
    }

    private static void primitiveDataTypes() {
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
