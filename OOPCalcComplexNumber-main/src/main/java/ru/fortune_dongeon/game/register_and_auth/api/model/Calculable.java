package ru.fortune_dongeon.game.register_and_auth.api.model;
@FunctionalInterface
@Deprecated
public interface Calculable <T,N extends Number> {
        double calculate(T real,char ch, N imaginary);
}
