package com.company;

public class ShortAnswerQuestion extends Question{

    public ShortAnswerQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if(answer.length() > 80) {
            System.out.println("Answer Was Longer than 80 Characters!");
            return false;
        }

        String actualAnswer = this.getTheAnswer();

        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
