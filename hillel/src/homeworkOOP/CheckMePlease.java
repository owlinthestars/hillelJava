package homeworkOOP;

/**
 * Created by Oleg on 15.10.2015.
 */
public class CheckMePlease  {
    public static void main(String[] args) {

       Blue blueColor = new Blue();
        Rectangle rectangle = new Rectangle();


        String areaOfColoredFigure =  blueColor.askColor() + rectangle.areaController();
        System.out.println(areaOfColoredFigure);
    }
}
