import java.util.Scanner;

/**
 * Created by OsadchiyO on 05.10.2015.
 */
public class Cat {
    Scanner scanner = new  Scanner (System.in);
    public static final boolean domestic = true;
    public static final boolean predator = true;

      boolean pet;
      int age;
      String name;
      String color;

    public Cat(){
        System.out.println("in cat constructor");
    }


   public Cat (boolean pet, int age, String name, String color ){
       this.pet = pet;
       this.age = age;
       this.name = name;
       this.color = color;

   }
}
