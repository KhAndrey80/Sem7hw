package ru.fortune_dongeon.game.register_and_auth.api.view;

public class ConsoleViewFactory implements ViewFactory {
    @Override
    public View createView() {
        return new ConsoleView();
    }
}

