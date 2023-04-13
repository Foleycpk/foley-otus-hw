import java.io.FileReader;
import java.util.Scanner;

public class Main {
    private static int counterOfRightAnswers = 0;
    private static int counterOfWrongAnswers = 0;

    public static void main(String[] args) {
        Question question1 = new Question("Какая из крупных нелетающих птиц родом из Австралии?");
        Question question2 = new Question("Какой национальности человек, чьим родным языком является кантонский?");
        Question question3 = new Question("В каком месте река впадает в море?");
        Question[] questions = {question1, question2, question3};

        question1.addAnswerVariants(new AnswerVariant("1) Киви", false), 0);
        question1.addAnswerVariants(new AnswerVariant("2) Страус", false), 1);
        question1.addAnswerVariants(new AnswerVariant("3) Эму", true), 2);

        question2.addAnswerVariants(new AnswerVariant("1) Перуанец", false), 0);
        question2.addAnswerVariants(new AnswerVariant("2) Китаец", true), 1);
        question2.addAnswerVariants(new AnswerVariant("3) Японец", false), 2);

        question3.addAnswerVariants(new AnswerVariant("1) Рукав", false), 0);
        question3.addAnswerVariants(new AnswerVariant("2) Устье", true), 1);
        question3.addAnswerVariants(new AnswerVariant("3) Русло", false), 2);

        for (Question question : questions) {
            Question.printQuestion(question);
            int userAnswer;

            try {
                userAnswer = getUserAnswer();
            } catch (Exception e) {
                throw new RuntimeException("Произошла ошибка: " + e.getMessage());
            }

            boolean isRightAnswer = question.checkRightAnswer(userAnswer);

            if (isRightAnswer) {
                System.out.println("Вы ответили правильно" + "\n");
                counterOfRightAnswers++;
            } else {
                System.out.println("Вы ответили неправильно" + "\n");
                counterOfWrongAnswers++;
            }
        }
        System.out.println("Результат: правильно "+ counterOfRightAnswers +", неправильно "+counterOfWrongAnswers);

    }
    private static int getUserAnswer() throws Exception {
        int userAnswer = 0;
            Scanner scanner = new Scanner(System.in);
            int counter = 1;
            while (!scanner.hasNextInt()) {

                if (counter >= 3) {
                    throw new Exception("превышено максимальное кол-во попыток ввода.");
                }

                System.out.println("Некорректный ввод: укажите номер варианта ответа");
                scanner.next();
                System.out.print("Ваш ответ: ");
                counter++;

            }
            try (FileReaderFake fr = new FileReaderFake()){
                userAnswer = scanner.nextInt();
                if (userAnswer > 3) {
                    throw new Exception("введенное число превышает максимально допустимое.");
                }
            }

        return userAnswer - 1;
    }
}