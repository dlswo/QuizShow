package org.letter;

        import java.util.Arrays;

public class SubjectiveQuiz extends Quiz {

    private String other;

    public SubjectiveQuiz(String text, String answer, String other) {
        super(text, answer);
        this.other = other;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return super.checkAnswer(userAnswer)|| this.other.equals(userAnswer);
    }
}
