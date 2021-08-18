package Challenges.Challenge5_FunctionsClasses;


/**
 * Write a description of class Car_Nishita here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
   //instance variables 
   private String CarMake; 
   private int ReleaseYear ;
   private int CarsInInventory ; 
   private double AvgMarket$Yearly;  
   //constructor
   public Car( String CMake, int Release, int Inventory, double AvgMarket)
   //make this name different than instance variables 
   {
     CarMake = CMake; 
     ReleaseYear = Release;
     CarsInInventory = Inventory;
     AvgMarket$Yearly = AvgMarket;
     //assigning 
   }
   //getter 1
   public String getCarMake() 
   {
    return CarMake; 
   }
   //getter 2
   public int getReleaseYear() 
   {
       return ReleaseYear;
   }
   //getter 3 
   public double getAvgMarket$Yearly()
   {
     return AvgMarket$Yearly;  
   }
   //getter 4
   public int getCarsInInventory()
   {
       return CarsInInventory; 
   }
   }
   
   
   

   
   


