package com.company;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;

    public  Question( String question, String answer) {

        this.theAnswer = answer;
        this.theQuestion = question;

    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkAnswer(String answer);


}
