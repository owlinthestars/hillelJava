package OOP;
import OOP.Cat;
/**
 * Created by OsadchiyO on 05.10.2015.
 */
public class Zoo {
    public static void main (String[] args){
        Cat tomCat1 = new Cat(true,3,"Tom","blue-grey");
//Наследование
        String sound = tomCat1.makeSound();
        System.out.println(sound);
//Полиморфизм

        Cat cat = new Cat();
        Animal animalCat = new Cat();

        sound = animalCat.makeSound();
        System.out.println("cat or animal? " + sound);

        Object cat1 = new Cat(true, 3, "Tom", "blue-grey");
        Object cat2 = new Cat(true, 3, "Tom", "blue-grey");
        System.out.println("Polymorfism equals " + cat1.equals(cat2));




        Object[] objects = new Object[10];
        objects[0]="some string";
        objects[1] = new Cat(true, 3, "Tom", "blue-grey");
        objects[2] = System.in;
        for(Object o : objects){
            System.out.println(o.toString());
        }

    }

    private static void equalsCats() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-grey") ;
        Cat tomCat2 = new Cat(true, 3, "Tom", "blue-grey") ;

        System.out.println(tomCat1.equals(tomCat2));
    }

    private static void referenseComparison() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-grey") ;
        Cat tomCat2 = new Cat(true, 3, "Tom", "blue-grey") ;

        System.out.println(tomCat1 == tomCat2);

        tomCat2 = tomCat1;
        System.out.println(tomCat1 == tomCat2);
    }

    private static void catCreation() {
        if (Cat.domestic){
            System.out.println("Cat is domestic animal");
        }
        if (Cat.predator){
            System.out.println("Cat is predator animal");
        }
        /*If i need object - i must to use 'new'*/
        Cat tomCat = new Cat(true, 3, "Tom", "blue-grey") ;

        Cat murzik = new Cat(true, 5, "Murzik", "black");

        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(tomCat.age);
        System.out.println(murzik.age);
    }
}
