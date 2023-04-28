package ru.otus.test.unit;

import ru.otus.game.Dice;
import ru.otus.game.Game;
import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;
import ru.otus.test.Assertions;
import ru.otus.test.unit.fakes.DiceWithWinnerPlayer2;
import ru.otus.test.unit.fakes.GameWinnerPrinterFake;

import java.util.ArrayList;
import java.util.List;

public class GameTestWithWinnerPlayer2 {

    public void testAppFlow() {
        String scenario = "Тест класса Game с победителем Игорем";
        try {
            List<String> expectedFlow = List.of("Первый бросок кубиков: 3",
                    "Второй бросок кубиков: 4",
                    "Победитель: Игорь");
            List<String> actualFlow = new ArrayList<>();
            Dice diceFake = new DiceWithWinnerPlayer2(actualFlow);
            GameWinnerPrinter GameWinnerPrinterFake = new GameWinnerPrinterFake(actualFlow);
            Game game = new Game(diceFake, GameWinnerPrinterFake);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            Assertions.assertEquals(expectedFlow.size(), actualFlow.size());

            for (int i = 0; i < expectedFlow.size(); i++) {
                Assertions.assertEquals(expectedFlow.get(i), actualFlow.get(i));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
