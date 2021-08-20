package Day9_ClassesOOPs;

/**
 * @author ranais
 * 
 * This class defines a student. You have access to his name, SID, classes
 */
public class Student
{
   private static int totalNumStudents = 0; 
    
   private int studID; //HAS NO VALUE void
   private String fName;
   private String lName;
   private int gradeMath;
   private int gradeScience;
   private int gradeEnglish;
   private double result;
   
   public Student( int studIDnum, String first, String last, int math, int sci, int eng )
   {
      studID = studIDnum;
      fName = first;
      lName = last;
      gradeMath = math;
      gradeScience = sci;
      gradeEnglish = eng;
      
      totalNumStudents = totalNumStudents + 1;
    }
    
    
    // a static method can have both static variables inside it but not non static ones
    // a non static method can have both kinds inside it because if you have an instance (an object) you have instance variables and static variables 
   public static void removeStudent()
   {
       totalNumStudents = 5;
       gradeScience = 10;
   }
   
    public void removeStudent1()
    {
        totalNumStudents = 5;
          gradeScience = 10;
    }
    public static int getNumStud()
    {
         return totalNumStudents;
    }
   
   // getters and setters
   public int getStudID()
   {
       return studID;
   }
   
   public String getStudLastName()
   {
       return lName;
   }
   
   public void setGradeMath(int newMathGrade)
   {
       gradeMath = newMathGrade;
   }
   
   public void setResult()
   {
       result = (gradeMath + gradeScience + gradeEnglish) / 3;
   }
   
   public double calcResult()
   {
       return (gradeMath + gradeScience + gradeEnglish) / 3.0;
   }
}
