package pl.survival.camp2.calc;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CalculatorBean {
    private BigDecimal accumulator;

    private BigDecimal input;

    private BinaryOperator<BigDecimal> operation;

    public void setAccumulator(final String input) {
        this.accumulator = toBigDecimal(input);
    }

    public void setInput(final String input) {
        this.input = toBigDecimal(input);
    }

    private BigDecimal toBigDecimal( final String input) {
        if (input != null && input.length() > 0 ) {
            return new BigDecimal(input);
        } else {
            return BigDecimal.ZERO;
        }
    }


    public void setOperation(String op) {
        if (op != null) {


            switch (op) {
                case "+":
                    this.operation = (a,b) -> a.add(b);
                    break;
                case "-":
                    this.operation = (a,b) -> a.subtract(b);
                    break;
                case "*":
                    this.operation = (a,b) -> a.multiply(b);
                    break;
                case "/":
                    this.operation = (a,b) -> a.divide(b);
                    break;
                default:
                    throw new UnsupportedOperationException("Operation "+ op + " is not yet supported." );
            }
            this.accumulator = this.operation.apply(this.accumulator, this.input);
        }
    }


    public String getAccumulator() {
        return this.accumulator.toPlainString();
    }
    public String getInput() {
        return this.input.toPlainString();
    }


}
