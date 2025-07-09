package com.github.dennga;

import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswerIndex;

   /**
    * 
    * @param questionText The text of the question.
    * @param options A list of strings representing the possible answer options. 
    * @param correctAnswerIndex The 0-based index of the correct answer within the 'options' list.
    */

    



    // Constructor (The Blueprint of a Question)
    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;

    }

    //Getter&Setter 
    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    /**
     * Method to check if the input of the User is correct.
     * @param userAnswerIndex The 0-based index chosen by the user.
     * @return True if the answer is correct, false otherwise.
     */ 

    public boolean isCorrect(int userAnswerIndex) {
        return userAnswerIndex == correctAnswerIndex;
    }

    // Method to return the correct answer after wrong input. 
    public String getCorrectAnswer() {
            return options.get(correctAnswerIndex);
        
    }

}    
