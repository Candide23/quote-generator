package com.company;

// Requirements:
// Add Questions To Quiz
// Run thr Quiz
// Grade the Quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList <Question> questions = new ArrayList<Question>();

    int numberOfQuestionsCorrect = 0;
    private Scanner input = new Scanner(System.in);

    // Constructor
    public Quiz(){

    }

    // Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        // Loop through each question

        for(Question question: questions) {

            // Ask the user the question
            System.out.println(question.getTheQuestion());
            // Get the users answer
            String usersAnswer = this.getUsersAnswers();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // Increment numberOfQuestionCorrect if answered correctly

            if(userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }

        }

        // Grade the Quiz

        double percentageCorrect =( (double) this.numberOfQuestionsCorrect / (double) this.questions.size())*100;

        System.out.println("User Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers() {

        String usersAnswer = input.nextLine();

        return usersAnswer;
    }
}
