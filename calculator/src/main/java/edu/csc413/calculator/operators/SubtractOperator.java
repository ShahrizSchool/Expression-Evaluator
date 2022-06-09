package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    @Override
    public int priority() {

        return 1; //the priority of subtracting is 1, just as the add operator
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {

        return new Operand(operandOne.getValue() - operandTwo.getValue());
        // this returns the result of subtracting both operands together.
    }
}
