package com.company;

public class CheckboxQuestion extends Question{


    public CheckboxQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        // Case Insensitive
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
