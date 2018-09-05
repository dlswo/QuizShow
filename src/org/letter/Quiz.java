package org.letter;

public class Quiz {
    String text;
    String answer;

    public Quiz(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }


    public boolean checkAnswer(String userAnswer){ //정답 확인하는 기능

        return this.answer.equals(userAnswer);
    }

    public String getQuestion() { // 문제를 내는 기능
        return this.text;
    }
}
