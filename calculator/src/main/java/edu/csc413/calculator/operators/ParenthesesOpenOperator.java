package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class ParenthesesOpenOperator extends Operator {
    @Override
    public int priority() {

        return 1;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {

        return null;
    }
}
