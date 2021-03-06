package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squick();
    }
    @Override
    String display() {
        return "rubber duck";
    }

}
