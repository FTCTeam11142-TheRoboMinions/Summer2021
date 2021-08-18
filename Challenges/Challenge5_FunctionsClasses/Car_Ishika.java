package Challenges.Challenge5_FunctionsClasses;


/**
 * You are a car manufacturer and you have to keep track of your inventory. You go to your best programmer, you, and ask them to 
 * make a program that accomplishes all of this
 * 
 * CAR Class
 *     SHould have ability to store information about 
 *                                                   car make (String), 
 *                                                   release year(int), 
 *                                                   number of such cars in inventory(int), 
 *                                                   avg market price for each car(double)
 *     Create Getters for each instance variable and a Setter for the number of cars in inventory.
    
 *     CarInventory Class
        No need to accept input from the user. Create two such objcets, naming the cars whatever you want and fill whatever information you want.
        Output atleast two instance variables, one of which should be num cars in inventory. Update the number of cars for one of the cars aNd keep the other one same.
        OUtput the Num cars again.
        
        Rules:
              Consistency in bracket placement
              Have variable names that a third person can easily understand
              Leave comments and be prepared to explain our code.
              
***************** IF YOU WANT PRACTICE FOR EVERYHING THAT I TAUGH IN CLASS THEN DO THIS PORTION ELSE DONT EVEN READ ***********************
               Make another Class called IndividualCar. This should have all the information as he Car Class above but a few aditional things.
               IT shoud have car mileage, amount of fuel in the car(in miles i.e. how many more miles can the car run), miles run, and avg speed.
               It should have a drive method that takes in to input paramters, avg speed and time driven for. Then caculate how many miles the car
               was driven for. Then make a decision based on this: If avg speed < 20, Mileage = 1.2*Mileage
                                                                      avg speed < 40, Mileage = 1.1*Mileage
                                                                      avg speed < 60, Mileage = Mileage
                                                                      else Mileage = 0.8 * Mileage.
             Once you know the mileage, calculate how many miles of fuel is left in the car and update the varaible. Update the average speed variable
             by averaging the last speed and the current speed. Keep asking the user if they drove the car some more and keep doing this if they did.
             
             Make a class called Driver and show that all the methods work an test it for yourself. 
        
 */
public class Car_Ishika
{
    private String cMake;
    //Car Make
    private int rYear;
    //Release Year
    private int numCars;
    //Number of cars in inventory
    private double markPrice;
    //Average market price
    public Car_Ishika( String carMake, int releaseYear, int numberCars, double marketPrice) 
    //Code for Challenge 5
    {
      cMake = carMake;
      
      rYear = releaseYear;
      
      numCars = numberCars;
      
      markPrice = marketPrice;
    }
    
    public String getcarMake() {
    return cMake;
    }
    
    public int getreleaseYear() {
    return rYear;
    }
    
    public int getnumberCars() {
    return numCars;
    }
    
    public double getmarketPrice() {
    return markPrice;
    }
    
    
    }

