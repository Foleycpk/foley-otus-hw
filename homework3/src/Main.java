import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = {
                "Какая из крупных нелетающих птиц родом из Австралии?",
                "Какой национальности человек, чьим родным языком является кантонский?",
                "В каком месте река впадает в море?"
        };
        String[][] answerVariant = {
                {"1) Киви", "2) Страус", "3) Эму"},
                {"1) Перуанец", "2) Китаец", "3) Японец"},
                {"1) Рукав", "2) Устье", "3) Русло"}
        };
        int [] rightVariant = {3, 2, 2};

        int counterOfRightAnswers = 0;
        int counterOfWrongAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerVariant.length; j++) {
                System.out.print(answerVariant[i][j] + " ");
            }
            System.out.println();

            System.out.print("Ваш ответ: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод: укажите номер варианта ответа");
                scanner.next();
                System.out.print("Ваш ответ: ");
            }

            int userSelection = scanner.nextInt();
            if (userSelection == rightVariant[i]) {
                System.out.println("Вы ответили правильно" + "\n");
                counterOfRightAnswers++;
            } else {
                System.out.println("Вы ответили неправильно" + "\n");
                counterOfWrongAnswers++;
            }
        }

        System.out.println("Результат: правильно " + counterOfRightAnswers + ", неправильно " + counterOfWrongAnswers);
    }
}