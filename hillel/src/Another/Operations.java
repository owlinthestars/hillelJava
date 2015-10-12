package Another;

/**
 * Created by OsadchiyO on 24.09.2015.
 */
public class Operations {
    public static void main (String [] args){
        int res = 5 + 89;
        res = res+1;
        res +=1;
        res++;
        ++res;
/*
        print(res++);
        print(++res);

        int mod = 5%4;
        print(mod);
*/

        boolean canAttend = paid() || advert(); //Kratkaya Logica


        System.out.println("Can Attend classes: " + canAttend);

        boolean hasEnoughtKnowledge = false;
        canAttend = paid() && hasEnoughtKnowledge();
        System.out.println("Can Attend classes " + canAttend);

        /*bit operations */

        /*m^k = s (xor)
        * s ^ k = k */

        int m = 20;
        int k = 15;
        print(m^k);
        print(27^k);

        /* ( & > | ) */

        int message = 100;
        int key = 31;
        int cripted = message ^ key;

        System.out.println("Crypted message is: " + cripted);

        int uncripted = cripted ^ key;
        System.out.println("Uncrypted message is: " + uncripted);
    }

    public static boolean paid(){
        System.out.println("in paid method ");
        return true;
    }
    public static boolean advert(){
        System.out.println("in advert method ");
        return false;
    }
    public static boolean hasEnoughtKnowledge(){
        System.out.println("in hasEnoughtKnowledge method ");
        return false;
    }


    public static void print (int i) {
        System.out.println(i);
    }
}
