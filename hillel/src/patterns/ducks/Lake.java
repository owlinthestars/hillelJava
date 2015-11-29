package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args) {


        test(new MallardDuck());

        test(new RedheadDuck());

        test(new RubberDuck());

        test(new Decoy());

        System.out.println("Jet test");

        Duck pilot = new RubberDuck();
        test(pilot);
        pilot.flyBehavior = new Jet();
        test(pilot);
    }

    private static void test(Duck Duck) {

        System.out.println(Duck.quack());
        System.out.println(Duck.fly());
        System.out.println(Duck.display());
    }
}
