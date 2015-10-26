package patterns.ducks;

/**
 * Created by OsadchiyO on 26.10.2015.
 */
public abstract class Duck {
    public String quack(){

        return "quack";
    }

    abstract String display();

    public String fly(){
        return "i'm flying!";
    }
    public String swim(){
        return "i can swim";
    }
}
