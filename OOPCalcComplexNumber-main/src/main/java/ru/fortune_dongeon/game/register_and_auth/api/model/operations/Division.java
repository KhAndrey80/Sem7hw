package ru.fortune_dongeon.game.register_and_auth.api.model.operations;

import ru.fortune_dongeon.game.register_and_auth.api.model.ComplexNumber;
import ru.fortune_dongeon.game.register_and_auth.api.model.Operation;

public class Division implements Operation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realResult = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryResult = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
