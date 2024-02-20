package ru.fortune_dongeon.game.register_and_auth.api.model.operations;

import ru.fortune_dongeon.game.register_and_auth.api.model.ComplexNumber;
import ru.fortune_dongeon.game.register_and_auth.api.model.Operation;

public class Subtraction implements Operation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() - b.getReal();
        double imaginaryResult = a.getImaginary() - b.getImaginary();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
