package com.github.dennga;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    // ---private fields---
    private int score;
    private List <Question> questionList;
    private Scanner sc;

    // Constructor for the QuizApp
    public Quiz() {
        this.questionList = new ArrayList<>();
        this.sc = new Scanner(System.in);

    }

    // 1. Method to add new Questions to the quiz
    public void addQuestion(Question question) {
    questionList.add(question);

    }
    // 2. Method to start the Quiz
    public void startQuiz() {
    
        System.out.println("Welcome to the IT-Quiz!"); 
        System.out.println("Answer the questions by typing the number of the correct option. \n");
        
        int userAnswer;

        // Extern For Loop to get Questions from questionList
        for (int i = 0; i < questionList.size(); i++) {
            Question currentQuestion = questionList.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
                
            List<String> currentOptions = currentQuestion.getOptions();
            
            // Intern For Loop to get the Options of the currentQuestions of the List
            for (int j = 0; j < currentOptions.size(); j++) {
                System.out.println((j + 1) + ". " + currentOptions.get(j));
            }
            System.out.println(); // Add a blank line for better readability
        
        userAnswer = sc.nextInt();
        
        
        // Checks if the user's input matches the question's correct answer.
        if (currentQuestion.isCorrect(userAnswer)) {
            score ++;
            System.out.println("Correct! You earned 1 Point.");
        } else {
             System.out.println("Incorrect! You earned 0 Points." + "The correct answer is: " + currentQuestion.getCorrectAnswer() );
        

            
        }
            
        }

        sc.close();


    }
    // 3. Method to show the Results
    public void displayResults() {

    }

    // 4. Method to return score 
    public int getScore() {
        return score;

    }

}
