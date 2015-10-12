package Another;

/**
 * Created by Oleg on 19.09.2015.
 */
public class AboutMyself {
    public static void main (String [] args){
        String myName = "Oleg";
        String fullName = "Osadchiy";

        /*Color palette*/
        final String green = ((char)27+"[32m");
        final String black = ((char)27+"[30m");
        final String red = ((char)27+"[31m");
        final String yellow = ((char)27+"[33m");
        final String blue = ((char)27+"[34m");
        final String blue2 = ((char)27+"[36m");
        final int bornYear = 1997;
        int todayYear = 2015;
        int myAge =(todayYear - bornYear);


        /*I wanted a little variety - find info about colors*/
        System.out.println(red + "Information about myself:"  );

        System.out.println(green + "Student fullname: "  + black + ( myName + " " + fullName));

        /*This way for displaying version w/o third partially*/

        System.out.println (blue + "My age without third Partially: " + black + (todayYear - bornYear));

        /*For rationality and full complete the task - displaying third partially*/
        System.out.println (yellow +"My age with third Partially: " + black + (myAge));

    }

}
