public class Question {
    private int number;
    private String text;
    private AnswerVariants[] answerVariants;

    public Question(int number, String text) {
        this.number = number;
        this.text = text;
    }
        public void addAnswerVariants(AnswerVariants answerVariant, int numberOfVariant) {
             answerVariants[numberOfVariant] = answerVariant;
        }
    public static void printQuestion(Question question){
        System.out.println(question.text);
        for (int i = 0; i < question.answerVariants.length; i++) {
            AnswerVariants.printAnswerVariantFor(question.answerVariants[i]);
        }
        System.out.println();
    }
    public boolean checkRightAnswer(int userAnswer) {

        if (answerVariants[userAnswer].rightAnswer) {

        }
    }

}






