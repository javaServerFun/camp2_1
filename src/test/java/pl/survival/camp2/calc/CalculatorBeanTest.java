package pl.survival.camp2.calc;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorBeanTest {

    @Test
    public void accumulatorParsingTest1() {
        final CalculatorBean testee = new CalculatorBean();
        testee.setAccumulator("123.1");
        assertEquals("123.1", testee.getAccumulator());
    }

    @Test
    public void accumulatorParsingTest2() {
        final CalculatorBean testee = new CalculatorBean();
        testee.setAccumulator("3.1415926536");
        assertEquals("3.1415926536", testee.getAccumulator());
    }
    @Test
    public void inputParsingTest1() {
        final CalculatorBean testee = new CalculatorBean();
        testee.setInput("123.1");
        assertEquals("123.1", testee.getInput());
    }

    @Test
    public void inputParsingTest2() {
        final CalculatorBean testee = new CalculatorBean();
        testee.setInput("3.1415926536");
        assertEquals("3.1415926536", testee.getInput());
    }

    @Test
    public void addTest() {
        final CalculatorBean testee = new CalculatorBean();
        testee.setInput("31");
        testee.setAccumulator("11");
        testee.add();
        assertEquals("42", testee.getAccumulator());
    }

}