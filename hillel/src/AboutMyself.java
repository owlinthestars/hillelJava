/**
 * Created by Oleg on 19.09.2015.
 */
public class AboutMyself {
    public static void main (String [] args){
        String myName = "Oleg";
        String fullName = "Osadchiy";

        /*I wanted a little variety - find info about colors*/
        System.out.println((char)27 + "[31mInformation about myself:" +(char)27 +  "[0m");

        System.out.println((char)27 + "[32mStudent fullname: " +(char)27 +"[0m" + myName + " " + fullName);

        final int bornYear = 1997;
        int todayYear = 2015;
        int myAge =(todayYear - bornYear);

        /*This way for displaying version w/o third partially*/

        System.out.println ((char)27 + "[34mMy age without third Partially: " +(char)27 +"[0m"+ (todayYear - bornYear));

        /*For rationality and full complete the task - displaying third partially*/
        System.out.println ((char)27 + "[33mMy age with third Partially: " +(char)27 +"[0m"+ (myAge));

    }

}
