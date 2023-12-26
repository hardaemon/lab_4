package org.example;

public class IntFunction <Type extends Argument> implements FunctionalArgument<Type> {
    private double lowLimit;
    public double highLimit;
    IntFunction(double lowLimit, double highLimit) {
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }
    @Override
    public double functionalAnswer(Type functionalArgument) {
        double intLow = functionalArgument.getLow();
        double intHigh = functionalArgument.getHigh();
        if (lowLimit < intLow || highLimit > intHigh) throw new IllegalArgumentException();
        double interval = (highLimit - lowLimit) / 1000000;
        double count = 0;
        for (double i = lowLimit; i < highLimit; i+=interval) {
            count+=functionalArgument.answer(i) * interval;
        }
        return count;
    }
}
