package OOP;

import java.util.Arrays;

/**
 * Created by OsadchiyO on 08.10.2015.
 */

//Abstract - abstractnii class, ne pozvolyaet sozdavat' example of this class;
    //static - premenyaetsya dlya vseh exemplyarov; esli dlya odnogo konkretnogo - static ne stavim;
    //V abstractom classe ne obyazatel'no ispol'zovanie interfeisa
public abstract class Animal implements Vaccinable{
   private int age;
    private String name;
    private String someField = "Animals field";
    private String[] vaccines = new String[3];
    private int vaccineCounter = 0;

    public Animal(){

    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (vaccineCounter != animal.vaccineCounter) return false;
        if (!name.equals(animal.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, animal.vaccines);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(vaccines);
        result = 31 * result + vaccineCounter;
        return result;
    }

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


    public String getName() {
    return name;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSomeField() {
        return someField;
    }

    public abstract String makeSound();
    //Abstractnoe ponyatie .

    public static String getTypeName(){
        return "animal";
    }
}
