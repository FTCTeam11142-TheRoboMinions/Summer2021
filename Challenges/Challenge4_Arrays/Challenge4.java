package Challenges.Challenge4_Arrays;
import java.util.Scanner;

/**
 * You are the teacher in a class of 4 students. Each student has 5 classes Math, Science, English, and 2 electives in a day and he gets a grade for all of them.
 * Your task is to automate the task of calculating the average grade for all the students and their rank. You know the grades for 2 students and you 
 * ask the user for input on the other two students. Then calculate their super score which is 
 *             English^2 + 2*(The greater betweeen Science and English) + SquareRoot of the minimum, between Science and English + 0.5(sum of electives)
 *             
 *             Rules:
 *                  1. Use sensible names
 *                  2. Use arrays, Scanner, Math class methods
 *                  3. Leave atleast comments.
 *                  
 */
 public class Challenge4 {
     public static void main (String args[])
     {
     //Code for Challenge 4    
    Scanner sc = new Scanner(System.in); 
    int[] K1 = {70, 75, 80, 85, 90};
    //Math 70, Science 75, English 80, Band 85, Art 90
    int[] K2 = {90, 85, 70, 65, 60};
    //Math 90, Science 85, English 70, Orchestra 65, Choir 60
    int K3; 
    int K4;
    System.out.println("Enter the grades for the third student");
     K3 = sc.nextInt();
    int []array = new int[5];
    for(int i=0; i<K3; K3++){
    }
 }
}
    
    
    
    

    


      
 

   
   
   
   



   
   
   

