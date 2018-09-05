package org.letter;

import java.util.ArrayList;

public class QuizService {


    ArrayList<Quiz> quizList;
    public QuizService() {
        this.quizList = new ArrayList<>();
    }

    public void addQuiz(Quiz quiz) { // 퀴즈를 추가
        this.quizList.add(quiz);
    }

    public Quiz getNext() { // 다음 퀴즈를 줘
        return this.quizList.remove(0); //첫번째 퀴즈를 하나씩 불러옴
    }










}
