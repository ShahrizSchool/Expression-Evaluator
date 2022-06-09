package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class MultiplyOperator extends Operator {
    @Override
    public int priority() {

        return 2; //the multiply operator has a priority
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {

        return new Operand(operandOne.getValue() * operandTwo.getValue());
        // this returns the result of multiplying both operands together.
    }
}
