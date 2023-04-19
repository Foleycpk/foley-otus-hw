package ru.otus.test.unit;

import ru.otus.game.Dice;
import ru.otus.game.DiceImpl;

public class DiceImplTest {
    String scenario = "Тест класса DiceImpl на валидность выбрасываемых значений";

    public void testAppFlow(){
        try {
            Dice diceImpl = new DiceImpl();

            for (int i = 0; i < 10; i++) {
                int result = diceImpl.roll();
                if (result < 0 || result > 6) {
                    throw new AssertionError("Выброшено не валидное значение");
                }
            }

            System.out.printf("\"%s\" passed %n", scenario);
            } catch (Throwable e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }
    }
