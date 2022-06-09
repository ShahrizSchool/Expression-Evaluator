package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class ParenthesesCloseOperator extends Operator {
    @Override
    public int priority() {

        return 0; //the priority of the parentheses is 0 because it is not need for any operations.
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {

        return null;
        //This function does not execute anything because it is parentheses.
    }
}
