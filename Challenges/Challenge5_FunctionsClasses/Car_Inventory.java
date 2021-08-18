package Challenges.Challenge5_FunctionsClasses;



public class Car_Inventory
{
   public static void main(String args[])
   {
       //object creation
       Car BMW = new Car ("BMW", 2018, 20, 4500); 
       int numcars = BMW.getCarsInInventory(); 
       int relyear = BMW.getReleaseYear(); 
       System.out.println("BMW was released in" + relyear + "number of BMW's in inventory is" + numcars); 
   }
}
