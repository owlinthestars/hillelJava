package patterns.ducks;

/**
 * Created by OsadchiyO on 29.10.2015.
 */
public class Jet implements FlyBehavior {
    @Override
    public String fly() {
        return "KABOOOOM!";
    }
}
