package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public abstract class Color implements Paintable {
    protected String colorName;
    protected int area;

    public abstract String askColor();
    public double getConsumed(int area, int consumption) {
        int areaConsumption = consumption*area;
        return areaConsumption;

    }
}
