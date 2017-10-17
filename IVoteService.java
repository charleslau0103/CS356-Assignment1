/*  
Author:     Charles Lau
Date:       10/12/2017
Due Date:   10/17/2017
Course:     CS 356.01
Professor:  Yu Sun
Assignment: 1
*/
package simulationdriver;

import java.util.HashMap;
        
public class IVoteService {
    private Question thisQuestion;
    private HashMap<String, Integer> answerMap = new HashMap<String, Integer>(10);
    // up to 10 answer choices
    
    public void setQuestion(Question question){
        thisQuestion = question;
        answerMap.clear();
        //clear the hashmap record everytime a new question is asked
    }
    
    public void displayQnA(){
        int[] answers = thisQuestion.getAnswers();
        String[] allChoices = thisQuestion.getAllChoices();
        
        System.out.println(thisQuestion.getQuestion());
        for (int i = 0; i < answers.length; i++)
        {
            System.out.println(allChoices[i] + " - " + answers[i]);
        }
    }
    
    public void submitAnswer(String iD, int answer){
        if(answer < thisQuestion.getAllChoices().length && answer >= 0){
            Integer lastAnswer = answerMap.put(iD, answer);
            
            if(lastAnswer != null){
                thisQuestion.retractAnswer(lastAnswer);
                //retract the last answer if student submit a new answer
            }
            thisQuestion.submitAnswer(answer);
        }
        else{
            System.out.println("Error - Invalid Answer from " + iD);
        }
    }
}
