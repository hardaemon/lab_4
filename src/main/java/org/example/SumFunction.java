package org.example;

public class SumFunction <Type extends Argument> implements FunctionalArgument<Type> {
    @Override
    public double functionalAnswer(Type functionalArgument) {
        double low = functionalArgument.getLow();
        double high = functionalArgument.getHigh();
        double middle = (high + low) / 2;
        return functionalArgument.answer(low) + functionalArgument.answer(middle) + functionalArgument.answer(high);
    }
}
