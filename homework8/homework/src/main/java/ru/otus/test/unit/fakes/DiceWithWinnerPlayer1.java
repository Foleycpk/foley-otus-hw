package ru.otus.test.unit.fakes;

import ru.otus.game.Dice;

import java.util.List;

public class DiceWithWinnerPlayer1 implements Dice {
    boolean isFirstRoll = true;
    private final List<String> actualFlow;
    public DiceWithWinnerPlayer1(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }


    @Override
    public int roll() {
        if (isFirstRoll) {
            isFirstRoll = false;
            actualFlow.add("Первый бросок кубиков: 5");
            return 5;
        } else {
            actualFlow.add("Второй бросок кубиков: 4");
            return 4;
        }
    }



}
