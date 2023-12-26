package org.example;
import java.lang.Math;

public class SinFunction implements Argument {
    private double low;
    private double high;
    private double A;
    private double B;
    SinFunction(double low, double high, double A, double B) {
        this.low = low;
        this.high = high;
        this.A = A;
        this.B = B;
    }
    @Override
    public double answer(double argument) { return A * Math.sin(B * argument); }
    @Override
    public double getLow() { return low; }
    @Override
    public double getHigh() { return high; }
}
