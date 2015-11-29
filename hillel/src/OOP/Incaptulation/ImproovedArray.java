package OOP.Incaptulation;

import java.util.Arrays;

/**
 * Created by OsadchiyO on 15.10.2015.
 */
public class ImproovedArray {
   private int[] ints = new int[2];
   private int counter = 0;


    public void add(int i){
        if(ints.length == size()){
            resize();
        }

        ints[counter] = i;
        counter++;
    }

    private void resize() {
        
        ints = Arrays.copyOf(ints, ints.length * 2);
    }

    public int size(){
        return counter;
    }
    public int get(int index){
        return ints[index];
    }

    @Override
    public String toString() {
        return "ImproovedArray{" +
                "ints=" + Arrays.toString(ints) +
                ", counter=" + counter +
                '}';
    }
}
