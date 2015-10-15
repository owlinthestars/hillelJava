package OOP;


/**
 * Created by OsadchiyO on 05.10.2015.
 */
public class Cat extends Animal {
    // public - видят все . private - только класс. protected - все наследники.
    public static final boolean domestic = true;
    public static final boolean predator = true;
        public String someField = "Cats field";
      boolean pet;
      String color;

    public Cat(){

    }


   public Cat (boolean pet, int age, String name, String color ){
       super(name, age);

       this.pet = pet;
       this.color = color;

   }
    @Override
    public boolean equals(Object otherObject){
        System.out.println("In cat equals method! ");
        if(!super.equals(otherObject)) return false;
        if(!(otherObject instanceof  Cat)) return false;

        Cat otherCat = (Cat) otherObject;
        if(pet != otherCat.pet)return false;
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
    public static String getTypeName(){
        return "cat";
    }
    public String getSomeField() {
        return someField;
    }
}
