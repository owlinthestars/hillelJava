package lesson26102015.mutableState;

import java.util.Comparator;

/**
 * Created by OsadchiyO on 02.11.2015.
 */
public class CarComparator implements Comparator<Car>{
    @Override
    public int compare(Car car1, Car car2) {


        return car1.model.compareTo(car2.model);
    }
}
