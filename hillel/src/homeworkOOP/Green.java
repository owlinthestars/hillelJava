package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public class Green extends Color {
    @Override
    public String askColor() {
        colorName = "Green";
         int area = 2;
        String result = ("Color name: " + colorName + "Area of color: " + area);
        return result;
    }

    @Override
    public double paintConsumed(int area, int consumption) {
        consumption= 2 * area;
        return consumption;
    }
}
