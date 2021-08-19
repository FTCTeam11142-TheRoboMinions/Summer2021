package Day9_ClassesOOPs;

public class StudentBody
{
   // accessModifier static DATATYPE identifier = 
   public static void main(String args[])
   {
       
       Student Minnie; //Declaring a vriable
       Minnie = new Student(001, "Minnie", "Mouse", 94, 79, 75); // object creation
       
       Student Mickey = new Student(001, "Mickey", "Mouse", 98, 89, 95); //object creation
       String lastName = Mickey.getStudLastName();
       int ID =  Mickey.getStudID();
       System.out.println("Hello " + lastName + ". Your SID number is " + ID);
   }
}