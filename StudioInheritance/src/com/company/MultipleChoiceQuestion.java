package com.company;

import java.util.Locale;

public class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(String question, String answer) {
        // super allow us to access parent's constructor
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A" or "B"

        String actualAnswer = this.getTheAnswer();

        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
