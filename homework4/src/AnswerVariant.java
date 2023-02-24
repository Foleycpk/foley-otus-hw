public class AnswerVariant {
    private String text;
    protected boolean rightAnswer;

    public AnswerVariant(String text, boolean rightAnswer) {
        this.text = text;
        this.rightAnswer = rightAnswer;
    }
    public static void printAnswerVariantFor(AnswerVariant answerVariant) {
        System.out.println(answerVariant.text);
    }
}
