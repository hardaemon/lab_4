package org.example;

public class DivisionFunction implements Argument{
    private double low;
    private double high;
    private double A;
    private double B;
    private double C;
    private double D;
    DivisionFunction(double low, double high, double A, double B, double C, double D) {
        this.low = low;
        this.high = high;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    @Override
    public double answer(double argument) {
        if ((C * argument + B) == 0 ) throw new IllegalArgumentException();
        return (A * argument + B) / (C * argument + D);
    }
    @Override
    public double getLow() { return low; }
    @Override
    public double getHigh() { return high; }
}
