package OOP;

import java.util.Arrays;

/**
 * Created by OsadchiyO on 12.10.2015.
 */
//kol-vo interfaces - ne ogranicheno;
public class Employee extends Human implements  Vaccinable  {

    private String position;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", vaccines=" + Arrays.toString(vaccines) +
                ", vaccineCounter=" + vaccineCounter +
                '}' + super.toString();
    }

    public void vaccinate(String vaccine){

        //Присваиваем номер вакцины 0го элемента.И с каждым след. разом добавляем +1
        vaccines[vaccineCounter] = vaccine;
        vaccineCounter++;

    }

}
