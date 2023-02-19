public class AnswerVariants {
    private Question question;
    private String text;
    private boolean rightAnswer;

    public AnswerVariants(Question question, String text, boolean rightAnswer) {
        this.question = question;
        this.text = text;
        this.rightAnswer = rightAnswer;
    }
    public static void printAnswerVariantFor(AnswerVariants answerVariant) {
        System.out.println(answerVariant.text);
    }
    public int getRightAnswer(int userAnswer) {

    }
}
