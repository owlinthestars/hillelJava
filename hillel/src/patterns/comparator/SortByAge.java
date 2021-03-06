package patterns.comparator;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class SortByAge implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {

        if(o1.getAge()> o2.getAge())
        {        return 1;}
        if(o1.getAge()<o2.getAge()){
            return -1;
        }
        return 0;
    }
}
