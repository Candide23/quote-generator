package com.company;

import java.util.ArrayList;
import java.util.Scanner;

// Requirements:

// Add Questions To Quiz
// Run the Quiz
// Grade the Quiz

public class Quiz {

    ArrayList<Question> questions = new ArrayList<>();

    int numberOfQuestionCorrect = 0;

    private Scanner input = new Scanner(System.in);

    //constructor
    public Quiz() {

    }


    //Methods

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {

        for(Question question: questions) {
            // Ask the user the question
            System.out.println(question.getTheQuestion());
            //Get the users answer
            String userAnswer = this.getUsersAnswers();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            // Increment numberOfQuestionCorrect if answered correctly
            if(userGotQuestionCorrect) {
                this.numberOfQuestionCorrect++;
            }

        }

        // Grade the quiz

        double percentageCorrect = ( (double) this.numberOfQuestionCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers() {

        String userAnswer = input.nextLine();
        return userAnswer;
    }
}
