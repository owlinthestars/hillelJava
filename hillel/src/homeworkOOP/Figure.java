package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public abstract class Figure implements Paintable {
    protected int a;
    protected int b;
    protected int area;
    protected String figuresName;

    public abstract String areaController();

    public double paintConsumed(int area, int consumption) {
        area = a*b;
        double paintConsumed = area * consumption;
        return paintConsumed;
    }
}
