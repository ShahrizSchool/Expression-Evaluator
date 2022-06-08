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
            operandNumber = Integer.parseInt(token);
        } catch (Exception ex){
            System.out.println("String can't be turned into an int");
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

        return operandNumber;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try{
            Integer.parseInt(token);
        }catch(Exception ex){
            return false;
        }
        return true;
    }
}
