package OOP;

/**
 * Created by OsadchiyO on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args) {


        printSound(new Cat());
        printSound(new Dog());
        Cat cat = new Cat();
        Dog dog = new Dog();
        vaccinate(cat);
        vaccinate(dog);

        Employee employee = new Employee();
        vaccinate(employee);


        System.out.println("Cat: " + cat.toString());
        System.out.println("Dog: " + dog.toString());
        //if u got this method in the class u can just only ask the object with this class, w/o another parammeters
        System.out.println("Cat: " + cat);
        System.out.println("Employee: " + employee);


        Employee employee1 = new Employee();
        Human human = employee1;
        Object object = human;
        //В данномм случае мы присвоили интерфейс Vaccinable - employee; Так что присвоить ему какой-то другой - мы не можем
        //UPCAST ???? find it! please!; not warning 
        Vaccinable vaccinable = employee1;

        //downcast - findit; - warning
        employee1 = (Employee) human;
        employee1.vaccinate("AASDASFA");

    }
    public static void vaccinate(Vaccinable animalOrEmployee  ){
        animalOrEmployee.vaccinate("ASD-1");
    }

    public static void printSound(Animal animal) {
        System.out.println(animal.makeSound());

    }
}
