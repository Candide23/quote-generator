package com.company;

public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        // answer = "true" "false"
        // answer = "TRUE" "FALSE"

        String actualAnswer = this.getTheAnswer();

        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }


}
