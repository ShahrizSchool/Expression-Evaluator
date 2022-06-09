package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    @Override
    public int priority() {

        return 3; //the power has a priority of 3
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {

        return new Operand((int) Math.pow(operandOne.getValue(), operandTwo.getValue())); //used the Math.pow to get power
        // this returns the result of the power both operands together.
    }
}
