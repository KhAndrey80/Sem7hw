package ru.fortune_dongeon.game.register_and_auth.api.view;

public interface View {
    void displayResult(double result);
    void displayError(String errorMessage);
    String getInput();
}