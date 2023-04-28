package ru.otus.test;

import ru.otus.test.unit.DiceImplTest;
import ru.otus.test.unit.GameTestWithNotValidDice;
import ru.otus.test.unit.GameTestWithWinnerPlayer1;
import ru.otus.test.unit.GameTestWithWinnerPlayer2;

public class AllTests {
    public static void main(String[] args) {
        new GameTestWithWinnerPlayer2().testAppFlow();
        new GameTestWithWinnerPlayer1().testAppFlow();
        new GameTestWithNotValidDice().testAppFlow();
        new DiceImplTest().testAppFlow();
    }

}
