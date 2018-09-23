package pl.survival.camp2.calc;

import java.math.BigDecimal;

public class CalculatorBean {
    private BigDecimal accumulator;

    private BigDecimal input;

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

    public BigDecimal add() {
        this.accumulator = this.accumulator.add(this.input);
        return this.input;
    }

    public String getAccumulator() {
        return this.accumulator.toPlainString();
    }
    public String getInput() {
        return this.input.toPlainString();
    }
}
