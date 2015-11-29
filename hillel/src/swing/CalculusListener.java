package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by OsadchiyO on 09.11.2015.
 */
public class CalculusListener implements ActionListener {
    private JTextField textContainer;
    private int firstOperand;
    public CalculusListener(JTextField textContainer){
        this.textContainer = textContainer;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        System.out.println(buttonPressed + " button pressed");



        switch (buttonPressed){
            case "+":
                firstOperand = Integer.parseInt(textContainer.getText());
                textContainer.setText("");
                break;
            case "=":
                Integer secondOperand = Integer.parseInt(textContainer.getText());
                secondOperand += firstOperand;
                textContainer.setText(secondOperand.toString());
                break;
            default:
                textContainer.setText(textContainer.getText() + buttonPressed);

        }

    }
}
