package patterns.comparator;

import OOP.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class CatComparator {
    public static void main(String[] args) {
        Cat tom = new Cat(false,4,"tom","black");
        Cat murzik = new Cat(true,1,"murzik","white");
        Cat barsik = new Cat(false,6,"barsik","blue");

        List<Cat> cats = new ArrayList<>();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);

        System.out.println("before sort: " + cats);

        Collections.sort(cats);
        System.out.println("After sort: ");

        print(cats);

        Collections.sort(cats, new SortByAge());
        System.out.println("sorted by age:");
        print(cats);

        Collections.sort(cats, new Reverse(new SortByAge()));
        System.out.println("sorted by age rev:");
        print(cats);
    }

    public static void print(List<Cat> cats){
        cats.forEach(System.out::println);
    }

}
