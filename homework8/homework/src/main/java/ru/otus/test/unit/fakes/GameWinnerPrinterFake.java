package ru.otus.test.unit.fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

public class GameWinnerPrinterFake implements GameWinnerPrinter {

    @Override
    public void printWinner(Player winner) {
        System.out.println("Победитель: Игорь");
    }
}
