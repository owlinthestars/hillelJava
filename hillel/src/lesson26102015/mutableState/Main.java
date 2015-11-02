package lesson26102015.mutableState;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by OsadchiyO on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Set<Car> dreamList = new TreeSet<>(new CarComparator());

        Car peterDream = new Car("Mercedes-benz",2010);
        Car ivanDream = new Car("Audi", 2013);
        Car alexDream = new Car("Porsche", 2015);


        dreamList.add(ivanDream);
        dreamList.add(peterDream);
        dreamList.add(alexDream);


        System.out.println(dreamList);
        dreamList.remove(alexDream);


       // alexDream.model = "Acura";
        dreamList.add(alexDream);

        System.out.println("ivan dream is " + dreamList.contains(ivanDream));
        System.out.println("alex dream is " + dreamList.contains(alexDream));
        System.out.println("peter dream is " + dreamList.contains(peterDream));

        System.out.println(dreamList);

        dreamList.remove(alexDream);
        alexDream = new Car("Porsche", 2015);

        dreamList.add(alexDream);


        String s = "asd";
        String copy = s;
        s+= "aaa";

        System.out.println(copy == s);


        Set<Car> hashedCars = new HashSet<>();
        hashedCars.add(alexDream);
        hashedCars.add(peterDream);
        hashedCars.add(ivanDream);

        Car seekedCar = new Car("Porsche", 2015);
        System.out.println("hashcode is: " + seekedCar.hashCode());
        System.out.println("hashSet contains porsche: " + hashedCars.contains(seekedCar));
    }
}
