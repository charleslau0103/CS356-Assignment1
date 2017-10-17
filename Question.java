/*  
Author:     Charles Lau
Date:       10/12/2017
Due Date:   10/17/2017
Course:     CS 356.01
Professor:  Yu Sun
Assignment: 1
*/
package simulationdriver;

public interface Question {
    
    public String getQuestion();
    
    public int[] getAnswers();
    
    public String[] getAllChoices();
    
    public void submitAnswer(int answer);
    
    public void retractAnswer(int answer);
    
}
