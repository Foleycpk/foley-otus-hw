package ru.otus.test.unit;

import ru.otus.game.Dice;
import ru.otus.game.Game;
import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;
import ru.otus.test.unit.fakes.DiceFake;
import ru.otus.test.unit.fakes.GameWinnerPrinterFake;

public class GameTests {

    public void testAppFlow() {
        String scenario = "Тест класса Game";

        try {
            Dice diceFake = new DiceFake();
            GameWinnerPrinter GameWinnerPrinterFake = new GameWinnerPrinterFake();
            Game game = new Game(diceFake, GameWinnerPrinterFake);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
