package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public class RedheadDuck extends Duck {
public RedheadDuck(){
    flyBehavior = new Fly();
    quackBehavior = new Quack();
}
    @Override
    public String display(){
        return "redhead duck ";
    }
}
