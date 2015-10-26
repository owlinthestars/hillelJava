package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class Decoy extends Duck {
    @Override
    String display() {
        return "decoy ";
    }
//badbadbad
    @Override
    public String fly() {
        return "fly no way";
    }

    @Override
    public String swim() {
        return "i can swim";
    }
}
