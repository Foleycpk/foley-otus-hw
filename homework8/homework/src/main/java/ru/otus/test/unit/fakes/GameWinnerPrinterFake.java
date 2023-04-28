package ru.otus.test.unit.fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.util.List;

public class GameWinnerPrinterFake implements GameWinnerPrinter {
    private final List<String> actualFlow;
    public GameWinnerPrinterFake(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(String.format("Победитель: %s", winner.getName()));
    }
}
