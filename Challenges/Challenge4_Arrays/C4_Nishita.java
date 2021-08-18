package Challenges.Challenge4_Arrays;
import java.util.*;

/**
 * Write a description of class C4_Nishita here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C4_Nishita
{
    public static void main (String args[])
    {
        // Challenge 4    
        Scanner sc = new Scanner(System.in); 
        int[] K1 = {70, 80, 60, 85, 75};
        //Math 70, Science 80, English 60, French 85, Art 75
        int[] K2 = {75, 90, 85, 65, 90};
        //Math 75, Science 90, English 85, Choir 65, Choir 90
        int[] K3 = new int[5]; 
        System.out.println("grades for student 3");
        int []array = new int[5];
        
        for(int i=0; i<5; i++)
        {
            K3[i] = sc.nextInt();
        }
        int[] K4 = new int[5];
        System.out.println("grades for student 4");
        for(int i=0; i<5;i++) {
            K4[i] =  sc.nextInt(); 
        }

    }

}
