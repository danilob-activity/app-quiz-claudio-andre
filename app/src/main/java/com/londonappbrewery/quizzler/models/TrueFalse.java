package com.londonappbrewery.quizzler.models;

/**
 * Created by aluno on 23/05/19.
 */

public class TrueFalse {
    private int mQuestion;
    private boolean mAnswer;

    public TrueFalse(int question, boolean answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    public int getQuestion() {

        return mQuestion;
    }

    public boolean mAnswer() {

        return mAnswer;
    }
}
