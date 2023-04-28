package ru.otus.test.unit.fakes;

import ru.otus.game.Dice;

import java.util.List;

public class DiceWithWinnerPlayer2 implements Dice {
    boolean isFirstRoll = true;

    @Override
    public int roll() {
        if (isFirstRoll) {
            isFirstRoll = false;
            return 3;
        } else {
            return 4;
        }
    }



}
