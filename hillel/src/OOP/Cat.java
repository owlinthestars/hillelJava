package OOP;


/**
 * Created by OsadchiyO on 05.10.2015.
 */
public class Cat extends Animal {
    // public - видят все . private - только класс. protected - все наследники.
    public static final boolean domestic = true;
    public static final boolean predator = true;

      boolean pet;
      String color;

    public Cat(){

    }


   public Cat (boolean pet, int age, String name, String color ){
       this.pet = pet;

       this.color = color;

   }
    @Override
    public boolean equals(Object otherObject){
        System.out.println("In cat equals method! ");
        if(!(otherObject instanceof  Cat)) return false;

        Cat otherCat = (Cat) otherObject;
        if(pet != otherCat.pet)return false;
        if(age != otherCat.age)return false;
        if(!(name.equals(otherCat.name)))return false;
        if(!(color.equals(otherCat.color)))return false;
        return  true;
    }

    //alt insert
    @Override
    public String toString() {
        //super - Результат toString method from Animal
        String result = super.toString();
        result += "Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    @Override
    public String makeSound() {
        return "Meow";

    }
}
