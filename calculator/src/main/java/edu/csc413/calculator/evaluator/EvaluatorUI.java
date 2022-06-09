package edu.csc413.calculator.evaluator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {

    private TextField expressionTextField = new TextField();
    private Panel buttonPanel = new Panel();

    // total of 20 buttons on the calculator,
    // numbered from left to right, top to bottom
    // bText[] array contains the text for corresponding buttons
    private static final String[] buttonText = {
        "7", "8", "9", "+", "4", "5", "6", "- ", "1", "2", "3",
        "*", "0", "^", "=", "/", "(", ")", "C", "CE"
    };

    /**
     * C  is for clear, clears entire expression
     * CE is for clear expression, clears last entry up until the last operator.
     */
    private Button[] buttons = new Button[buttonText.length];

    public static void main(String argv[]) {

        new EvaluatorUI();
    }

    public EvaluatorUI() {
        setLayout(new BorderLayout());
        this.expressionTextField.setPreferredSize(new Dimension(600, 50));
        this.expressionTextField.setFont(new Font("Courier", Font.BOLD, 28));

        add(expressionTextField, BorderLayout.NORTH);
        expressionTextField.setEditable(false);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 4));

        //create 20 buttons with corresponding text in bText[] array
        Button tempButtonReference;
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            tempButtonReference = new Button(buttonText[i]);
            tempButtonReference.setFont(new Font("Courier", Font.BOLD, 28));
            buttons[i] = tempButtonReference;
        }

        //add buttons to button panel
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            buttonPanel.add(buttons[i]);
        }

        //set up buttons to listen for mouse input
        for (int i = 0; i < EvaluatorUI.buttonText.length; i++) {
            buttons[i].addActionListener(this);
        }

        setTitle("Calculator");
        setSize(400, 400);
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This function is triggered anytime a button is pressed
     * on our Calculator GUI.
     * @param actionEventObject Event object generated when a
     *                    button is pressed.
     */
    public void actionPerformed(ActionEvent actionEventObject) {

        String buttonPressed = actionEventObject.getActionCommand();

        if(buttonPressed.equals("=")){
            try{
                Evaluator eval = new Evaluator();
                expressionTextField.setText(Integer.toString(eval.evaluateExpression(expressionTextField.getText())));
                boolean equals = false;
                equals = true;
                System.out.println("answer of the expression when clicked equals");
                //this will be the answer of the expression when the equal button is clicked.

            } catch (Exception ex) {
                expressionTextField.setText("0");
                System.out.println("if no expression then set to 0, or invalid expression then error");
                //if no expression then set to 0, or invalid expression then error
            }
        } else if (buttonPressed.equals("CE")){
            //CE is there to delete one string or character, not delete the whole expression
            if(expressionTextField.getText().length() == 1){
                expressionTextField.setText(" ");
            } else if (expressionTextField.getText().length() > 1) {
                expressionTextField.setText(expressionTextField.getText().substring(0, expressionTextField.getText().length() -1));
            }
            System.out.println("this is to delete one int at a time instead of clearing the whole expression.");
        } else if (buttonPressed.equals("C")){
            //Clears everything
            expressionTextField.setText(" ");
            System.out.println("Text field was clear");
        } else {
            //the rest of the buttons that don't have a special case
            expressionTextField.setText(expressionTextField.getText() + buttonPressed);
        }

    }
}
