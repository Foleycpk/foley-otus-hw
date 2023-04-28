package ru.otus.test.unit.fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.util.List;

public class GameWinnerPrinterFakeWithFlow implements GameWinnerPrinter {
    private final List<String> actualFlow;
    public GameWinnerPrinterFakeWithFlow(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(String.format("Победитель: %s", winner.getName()));
    }
}
