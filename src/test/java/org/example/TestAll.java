package org.example;
import java.lang.Math;
import org.junit.Test;
import java.util.Objects;
import static org.junit.Assert.*;

public class TestAll {
    @Test
    public void TestSumFunctionLine() {
        LineFunction LF = new LineFunction(1, 5, 2, 3);
        SumFunction<LineFunction> SF = new SumFunction<>();
        double expected = LF.answer(1) + LF.answer(3) + LF.answer(5);
        double sum = SF.functionalAnswer(LF);
        assertTrue(Objects.equals(expected, sum));
    }
    @Test
    public void TestSumFunctionSin() {
        SinFunction SinF = new SinFunction(1, 5, 2, 3);
        SumFunction<SinFunction> SF = new SumFunction<>();
        double expected = SinF.answer(1) + SinF.answer(3) + SinF.answer(5);
        double sum = SF.functionalAnswer(SinF);
        assertTrue(Objects.equals(expected, sum));
    }
    @Test
    public void TestSumFunctionDivision() {
        DivisionFunction DF = new DivisionFunction(1, 5, 2, 3, 6, 8);
        SumFunction<DivisionFunction> SF = new SumFunction<>();
        double expected = DF.answer(1) + DF.answer(3) + DF.answer(5);
        double sum = SF.functionalAnswer(DF);
        assertTrue(Objects.equals(expected, sum));
    }
    @Test
    public void TestSumFunctionExp() {
        ExpFunction EF = new ExpFunction(1, 5, 2, 3);
        SumFunction<ExpFunction> SF = new SumFunction<>();
        double expected = EF.answer(1) + EF.answer(3) + EF.answer(5);
        double sum = SF.functionalAnswer(EF);
        assertTrue(Objects.equals(expected, sum));
    }

    @Test
    public void TestIntFunctionLine() {
        LineFunction LF = new LineFunction(1, 5, 2, 3);
        IntFunction<LineFunction> IF = new IntFunction<>(1, 5);
        double expected = 36;
        double oInt = IF.functionalAnswer(LF);
        assertEquals(expected, oInt, 0.0001);
    }
    @Test
    public void TestIntFunctionSin() {
        SinFunction SF = new SinFunction(Math.PI/2, Math.PI, 2, 1);
        IntFunction<SinFunction> IF = new IntFunction<>(Math.PI/2, Math.PI);
        double expected = 2;
        double oInt = IF.functionalAnswer(SF);
        assertEquals(expected, oInt, 0.00001);
    }
    @Test
    public void TestIntFunctionDivision() {
        DivisionFunction DF = new DivisionFunction(1, 2, 2, 1, 4, 0);
        IntFunction<DivisionFunction> IF = new IntFunction<>(1, 2);
        double expected = Math.log(2)/4+0.5;
        double oInt = IF.functionalAnswer(DF);
        assertEquals(expected, oInt, 0.00001);
    }
    @Test
    public void TestIntFunctionExp() {
        ExpFunction EF = new ExpFunction(0, 1, 2, 3);
        IntFunction<ExpFunction> IF = new IntFunction<>(0, 1);
        double expected = 2*Math.exp(1)+1;
        double oInt = IF.functionalAnswer(EF);
        assertEquals(expected, oInt, 0.00001);
    }
}