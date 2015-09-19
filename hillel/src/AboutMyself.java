/**
 * Created by Oleg on 19.09.2015.
 */
public class AboutMyself {
    public static void main (String [] args){
        String myName = "Oleg";
        String fullName = "Osadchiy";

        /*–ешил немного разнообразить, поискал информацию в интеренете - помен€л цвет*/
        System.out.println((char)27 + "[31mInformation about myself:" +(char)27 +  "[0m");

        System.out.println((char)27 + "[32mStudent fullname: " +(char)27 +"[0m" + myName + " " + fullName);

        final int bornYear = 1997;
        int todayYear = 2015;
        int myAge =(todayYear - bornYear);

        /*“акой способ, если не выводить решение в одну переменную*/

        System.out.println ((char)27 + "[34mMy age without third Partially: " +(char)27 +"[0m"+ (todayYear - bornYear));

        /*Ќо дл€ рациональности и полного соблюдени€ задани€ - выведем через третью переменную*/
        System.out.println ((char)27 + "[33mMy age with third Partially: " +(char)27 +"[0m"+ (myAge));

    }

}
