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
 *                  4. Leave atleast 3 comments.
 *                  
 */
public class C4_Rithwick
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // Student 1 and 2's grades
        int[] S1 = {97,55,32,65,66};
        int[] S2 = {81,5,81,50,31};
        int[] S3 = {0,0,0,0,0} ;
        int[] S4 = {0,0,0,0,0} ;
        // Student 1's super score calculations
        double S1score = (S1[0] * S1[0]) * Math.max(S1[1], S1[2]) + Math.sqrt(Math.min(S1[1], S1[2])) + ((S1[3] + S1[4])* 0.5);
        System.out.println("Student 1's super score is ");
        System.out.println(S1score);
        // Student 2's super score calculations
        double S2score = (S2[0] * S2[0]) * Math.max(S2[1], S2[2]) + Math.sqrt(Math.min(S2[1], S2[2])) + ((S2[3] + S2[4])* 0.5);
        System.out.println("Student 2's super score is ");
        System.out.println(S2score);
        //Gets student 3's grades from user
        System.out.println("Chose a score for Student 3 - Math between 1 and 100");
        S3[0] = sc.nextInt();
        System.out.println("Chose a score for Student 3 - Science between 1 and 100");
        S3[1] = sc.nextInt();
        System.out.println("Chose a score for Student 3 - English between 1 and 100");
        S3[2] = sc.nextInt();
        System.out.println("Chose a score for Student 3 - Elective 1 between 1 and 100");
        S3[3] = sc.nextInt();
        System.out.println("Chose a score for Student 3 - Elective 2 between 1 and 100");
        S3[4] = sc.nextInt();
        // calculation for student 3's grades
        double S3score = (S3[0] * S3[0]) * Math.max(S3[1], S3[2]) + Math.sqrt(Math.min(S3[1], S3[2])) + ((S3[3] + S3[4])* 0.5);
        System.out.println("Student 3's super score is ");
        System.out.println(S3score);

        //Gets student 4's grades from user
        System.out.println("Chose a score for Student 4 - Math between 1 and 100");
        S4[0] = sc.nextInt();
        System.out.println("Chose a score for Student 4 - Science between 1 and 100");
        S4[1] = sc.nextInt();
        System.out.println("Chose a score for Student 4 - English between 1 and 100");
        S4[2] = sc.nextInt();
        System.out.println("Chose a score for Student 4 - Elective 1 between 1 and 100");
        S4[3] = sc.nextInt();
        System.out.println("Chose a score for Student 4 - Elective 2 between 1 and 100");
        S4[4] = sc.nextInt();
        // calculation for student 4's grades
        double S4score = (S4[0] * S4[0]) * Math.max(S4[1], S4[2]) + Math.sqrt(Math.min(S4[1], S4[2])) + ((S4[3] + S4[4])* 0.5);
        System.out.println("Student 4's super score is ");
        System.out.println(S4score);

    }
}


   