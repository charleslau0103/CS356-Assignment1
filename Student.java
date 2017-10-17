/*  
Author:     Charles Lau
Date:       10/12/2017
Due Date:   10/17/2017
Course:     CS 356.01
Professor:  Yu Sun
Assignment: 1
*/
package simulationdriver;
       
public class Student {
    private String iD;
    private IVoteService iVote;
    
    public Student(String iD, IVoteService iVote){
        this.iD = iD;
        this.iVote = iVote;
    }
   
    public String getID(){
        return iD;
    }
    
    public void submitAnswer(int answers){
        iVote.submitAnswer(iD, answers);
    }
            
}
