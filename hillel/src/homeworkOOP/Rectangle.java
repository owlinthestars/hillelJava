package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public class Rectangle extends Figure{
    @Override
    public String areaController() {
        int area = a*b;
        int perimeter =(a*2+b*2);
        String result = ("Area of rectangle: " + area + " Perimeter of rectangle: " + perimeter);
        return result;

    }
}
