/*  
Author:     Charles Lau
Date:       10/12/2017
Due Date:   10/17/2017
Course:     CS 356.01
Professor:  Yu Sun
Assignment: 1
*/
package simulationdriver;

public class MultipleChoice implements Question{
    private String question;
    private int[] answers;
    private String[] allChoices;
    
    public MultipleChoice(String question, String[] allChoices){
        this.question = question;
        answers = new int[allChoices.length];
        this.allChoices = allChoices;     
    }
    
    public String getQuestion(){
        return question;
    }
    
    public int[] getAnswers(){
        return answers;
    }
    
    public String[] getAllChoices(){
        return allChoices;
    }
    
    public void submitAnswer(int answer){
        answers[answer] = answers[answer] + 1;     
    }
    
    public void retractAnswer(int answer){
        answers[answer] = answers[answer] - 1;
    }
}

