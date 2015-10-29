package patterns.iterator;

import OOP.Cat;
import lesson26102015.RecursiveLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class MainIterator {
    public static void main(String[] args) {
        Cat tom = new Cat(false,4,"tom","black");
        Cat murzik = new Cat(true,1,"murzik","white");
        Cat barsik = new Cat(false,6,"barsik","blue");

    RecursiveLinkedList cats = new RecursiveLinkedList();
        cats.add(tom);
        cats.add(murzik);
        cats.add(barsik);


        Iterator iterator = new RecursiveLinkedListIterator(cats);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List someList = new ArrayList<>();
        System.out.println("In foreach loop: ");
        for (Object o : cats){
            System.out.println(o);

        }
    }
}
