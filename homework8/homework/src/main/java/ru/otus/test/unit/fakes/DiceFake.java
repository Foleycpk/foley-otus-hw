package ru.otus.test.unit.fakes;

import ru.otus.game.Dice;

public class DiceFake implements Dice {
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
