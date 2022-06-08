package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    int operNumber;
    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        try{
            operNumber = Integer.parseInt(token);
        } catch (Exception ex){
            System.out.println(ex + ": A String can't be changed to an int.");
        }

    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {

    }

    /**
     * return value of operand
     */
    public int getValue() {
        return 0;
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
