import java.util.Scanner;

public class Test {
    private static int counterOfRightAnswers = 0;
    private static int counterOfWrongAnswers = 0;

    public static void main(String[] args) {
        Question question1 = new Question(1, "Какая из крупных нелетающих птиц родом из Австралии?");
        Question question2 = new Question(2, "Какой национальности человек, чьим родным языком является кантонский?");
        Question question3 = new Question(2, "В каком месте река впадает в море?");
        Question[] questions = {question1, question2, question3};

        question1.addAnswerVariants(new AnswerVariants(question1, "1) Киви", false), 1);
        question1.addAnswerVariants(new AnswerVariants(question1, "2) Страус", false), 2);
        question1.addAnswerVariants(new AnswerVariants(question1, "3) Эму", true), 3);

        question2.addAnswerVariants(new AnswerVariants(question1, "1) Перуанец", false), 1);
        question2.addAnswerVariants(new AnswerVariants(question1, "2) Китаец", true), 2);
        question2.addAnswerVariants(new AnswerVariants(question1, "3) Японец", false), 3);

        question3.addAnswerVariants(new AnswerVariants(question1, "1) Рукав", false), 1);
        question3.addAnswerVariants(new AnswerVariants(question1, "2) Устье", true), 2);
        question3.addAnswerVariants(new AnswerVariants(question1, "3) Русло", false), 3);

        for (Question question : questions) {
            question.printQuestion(question);

            int userAnswer = getUserAnswer();
            boolean isRightAnswer = question.checkRightAnswer(userAnswer);
        }


    }

    private static int getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Результат: правильно "+ counterOfRightAnswers +", неправильно "+counterOfWrongAnswers);
    }
}