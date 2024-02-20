package ru.fortune_dongeon.game.register_and_auth.api.model.operations;

import ru.fortune_dongeon.game.register_and_auth.api.model.ComplexNumber;
import ru.fortune_dongeon.game.register_and_auth.api.model.Operation;

public class Multiplication implements Operation{


    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryResult = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
