package TDD;

import OOP.Cat;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by OsadchiyO on 19.10.2015.
 JUnit
 */
public class SortingTest {

    @Test
    public void sortInAscendingOrder(){
        Integer[] unsorted = {111,999,777,888,333,222,555,666,444};

        Sorter sorter = new Sorter();
       Integer[] sorted = (Integer[]) sorter.sort(unsorted);

        Integer[] expected = {111,222,333,444,555,666,777,888,999};

        Assert.assertArrayEquals("Test is down", expected,sorted);

    }
    @Test
    public void sourceArrayShouldBeUnsorted(){
        Integer[] unsorted = {111,999,777,888,333,222,555,666,444};
        Integer[] expected = {111,999,777,888,333,222,555,666,444};
        Sorter sorter = new Sorter();
        sorter.sort(unsorted);

        Assert.assertArrayEquals("Source array is sorted: ",expected,unsorted);
    }
    @Test
    public void catsShiouldBeSortedByName(){
        Cat cat = new Cat(false,2, "Tom","Black");
        Cat cat2 = new Cat(false,2,"Cats name","white");
        Cat[] cats = {cat, cat2};



        Sorter sorter = new Sorter();
        Cat[] sorted=  (Cat[]) sorter.sort(cats);

        Cat[] expected = {cat2, cat};
        Assert.assertArrayEquals("cats arent sorted",expected,sorted);

    }
}
