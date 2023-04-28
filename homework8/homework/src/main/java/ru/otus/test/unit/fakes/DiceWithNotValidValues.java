package ru.otus.test.unit.fakes;

import ru.otus.game.Dice;

import java.util.List;

public class DiceWithNotValidValues implements Dice {
    boolean isFirstRoll = true;
    private final List<String> actualFlow;
    public DiceWithNotValidValues(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }


    @Override
    public int roll() {
        if (isFirstRoll) {
            isFirstRoll = false;
            actualFlow.add("Первый бросок кубиков: 3");
            return 3;
        } else {
            actualFlow.add("Второй бросок кубиков: 7");
            return 7;
        }
    }



}
