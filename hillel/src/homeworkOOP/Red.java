package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public class Red extends Color{
    @Override
    public String askColor() {
        colorName = "Red";
        area = 3;
        String result = ("Color name: " + colorName + "Area of color: " + area);
        return result;
    }

    @Override
    public double paintConsumed(int area, int consumption) {
        return 0;
    }
}
