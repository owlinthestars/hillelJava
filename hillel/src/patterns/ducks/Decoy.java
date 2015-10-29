package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class Decoy extends Duck {

    public Decoy() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    String display() {
        return "decoy ";
    }
}

