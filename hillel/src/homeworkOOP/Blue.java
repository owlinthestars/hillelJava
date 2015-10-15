package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public class Blue extends Color {

    @Override
    public String askColor() {
        colorName = "Blue";
        area = 1;
        String result = ("Color name: " + colorName + "Area of color: " + area);
        return result;
    }
}
