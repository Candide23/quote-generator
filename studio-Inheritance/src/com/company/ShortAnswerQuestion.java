package com.company;

public class ShortAnswerQuestion extends Question {


    public ShortAnswerQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if(answer.length() > 80) {
            System.out.println("Answer Was Longer Than 8 Characters!");
        }

        String actualAnswer = this.getTheAnswer();


        // Case Insensitive
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
