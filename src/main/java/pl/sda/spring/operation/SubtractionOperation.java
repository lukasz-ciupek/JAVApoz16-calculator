package pl.sda.spring.operation;

import org.springframework.stereotype.Component;

@Component
class SubtractionOperation implements Operation {

    @Override
    public double calculate(double arg1, double arg2) {
        return arg1 - arg2;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.SUBTRACTION;
    }
}
