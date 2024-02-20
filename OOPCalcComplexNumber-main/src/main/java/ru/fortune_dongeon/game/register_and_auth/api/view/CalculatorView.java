package ru.fortune_dongeon.game.register_and_auth.api.view;

import ru.fortune_dongeon.game.register_and_auth.api.model.ComplexNumber;

public class CalculatorView {
    private View view;

    public CalculatorView(ViewFactory factory) {
        this.view = factory.createView();
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Реззультат Операции : " + result.getReal() +  " и " + result.getImaginary() + "i");
    }

    public void displayError(String errorMessage) {
        view.displayError(errorMessage);
    }

    public String getInput() {
        return view.getInput();
    }
}