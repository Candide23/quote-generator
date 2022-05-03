package com.company;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;

    public Question(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    // Methods

    public abstract boolean checkAnswer(String answer);


}
