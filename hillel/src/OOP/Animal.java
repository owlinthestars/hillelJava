package OOP;

import java.util.Arrays;

/**
 * Created by OsadchiyO on 08.10.2015.
 */

//Abstract - abstractnii class, ne pozvolyaet sozdavat' example of this class;
    //static - premenyaetsya dlya vseh exemplyarov; esli dlya odnogo konkretnogo - static ne stavim;
    //V abstractom classe ne obyazatel'no ispol'zovanie interfeisa
public abstract class Animal implements Vaccinable{
    int age;
    String name;
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;


    public void vaccinate(String vaccine){

        //Присваиваем номер вакцины 0го элемента.И с каждым след. разом добавляем +1
        vaccines[vaccineCounter] = vaccine;
        vaccineCounter++;

    }

    public String toString(){
        String result = " name: " + name;
        result  += " age: " + age;
        result += " vaccines: " + Arrays.toString(vaccines);
        return result;
    }

    public abstract String makeSound();
    //Abstractnoe ponyatie .
}
