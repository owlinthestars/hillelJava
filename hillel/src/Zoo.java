/**
 * Created by OsadchiyO on 05.10.2015.
 */
public class Zoo {
    public static void main (String[] args){
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
