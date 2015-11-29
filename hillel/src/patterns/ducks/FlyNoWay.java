package patterns.ducks;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public String fly() {
        return "i cant fly";
    }
}
