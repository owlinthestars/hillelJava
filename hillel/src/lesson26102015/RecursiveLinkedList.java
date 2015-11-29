package lesson26102015;

import patterns.iterator.RecursiveLinkedListIterator;

import java.util.Iterator;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class RecursiveLinkedList implements Iterable {
private ListElement head;


    public int size() {
    if(head == null ){
        return 0;
    }    else{
        return head.size();
    }

    }

    public void add(Object value) {
        if (head == null){
            head = new ListElement(value);
        }else{
            head.add(value);
        }
    }

    public Object get(int index) {
        if(head == null ){
            return null;
        }else{
            return head.get(index);
        }
    }

    public ListElement getHead() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return new RecursiveLinkedListIterator(this);
    }
}
