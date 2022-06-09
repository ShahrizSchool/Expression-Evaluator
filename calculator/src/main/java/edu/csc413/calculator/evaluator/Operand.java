package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    private int operandNumber;
    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        try{
            operandNumber = Integer.parseInt(token); //turn the string into a int
        } catch (Exception ex){
            System.out.println("String can't be turned into an int"); // couldn't turn string into int
        }

    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.operandNumber = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {

        return operandNumber; //this will return the operand value
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try{
            Integer.parseInt(token); //this is to check if the token is an int
        }catch(Exception ex){
            return false;
        }
        return true;
    }
}
