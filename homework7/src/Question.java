public class Question {
    private String text;
    private AnswerVariant[] answerVariants = new AnswerVariant[3];

    public Question(String text) {
        this.text = text;
    }
        public void addAnswerVariants(AnswerVariant answerVariant, int numberOfVariant) {
             answerVariants[numberOfVariant] = answerVariant;
        }
    public static void printQuestion(Question question){
        System.out.println(question.text);
        for (int i = 0; i < question.answerVariants.length; i++) {
            AnswerVariant.printAnswerVariantFor(question.answerVariants[i]);
        }
        System.out.println();
    }
    public boolean checkRightAnswer(int userAnswer) {
        return answerVariants[userAnswer].rightAnswer;
    }

}






