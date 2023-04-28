package ru.otus.test.unit.fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.util.List;

public class GameWinnerPrinterFake implements GameWinnerPrinter {
    private final List<String> realWinner;
    public GameWinnerPrinterFake(List<String> realWinner) {
        this.realWinner = realWinner;
    }

    @Override
    public void printWinner(Player winner) {
        realWinner.add(winner.getName());
    }
}