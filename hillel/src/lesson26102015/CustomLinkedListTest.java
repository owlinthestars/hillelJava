package lesson26102015;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class CustomLinkedListTest {

    @Test
    public void sizeChangedOnAdd(){
        CustomLinkedList list = new CustomLinkedList();

        Assert.assertEquals(0, list.size());

        list.add(1);
        Assert.assertEquals(1, list.size());
        list.add(1);
        Assert.assertEquals(2, list.size());
        list.add(1);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void getResultAppropriateElements(){
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(1, list.get(0));
        Assert.assertEquals(2, list.get(1));
        Assert.assertEquals(3, list.get(2));
    }
}
