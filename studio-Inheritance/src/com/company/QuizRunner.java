package com.company;

public class QuizRunner {

    public static void main(String[] args) {
	// write your code here

        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion("What is the capital of the USA\nA: Paris\nB: Washington","Washington");
        myQuiz.addQuestion(multipleChoiceQuestion);

        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion("Dog are omnivore?\n True or False", "True");
        myQuiz.addQuestion(trueFalseQuestion);

        CheckboxQuestion checkboxQuestion = new CheckboxQuestion("Select all that apply, which animals can fly\nA: cat\nB: Lion\nC: bird", "c");

        myQuiz.addQuestion(checkboxQuestion);

        myQuiz.runQuiz();

    }
}
