package patterns.ducks;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "i am flying";
    }
}
