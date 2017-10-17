/*  
Author:     Charles Lau
Date:       10/12/2017
Due Date:   10/17/2017
Course:     CS 356.01
Professor:  Yu Sun
Assignment: 1
*/
package simulationdriver;

import java.util.Random;
        
public class SimulationDriver {

    public static void main(String[] args) {
        Random random = new Random();
        int numStudents = random.nextInt(100);
        // generate random number of students within 100
        IVoteService iVote = new IVoteService();
        Student[] students = new Student[numStudents];
        
        System.out.println("There are " + numStudents + " students in this service");
        
        for(int i = 0; i < students.length; i++){
            students[i] = new Student(String.valueOf(random.nextInt(1000)), iVote);
        }
        
        iVote.setQuestion(new SingleChoice("\n1. Yu Sun is a Professor in CPP.", "True", "False"));
        
        for(Student stud: students){
            stud.submitAnswer(random.nextInt(2));                         
        }      
        iVote.displayQnA();
        
        String[] answers = {"A", "B", "C", "D", "E"};
        iVote.setQuestion(new MultipleChoice("\n2. Choose 'A' to get A in this class. Pick other answers to get 'F'.", answers) {});
        
        for(Student stud: students){
            stud.submitAnswer(random.nextInt(5));
        }       
        iVote.displayQnA();             
    }   
}
