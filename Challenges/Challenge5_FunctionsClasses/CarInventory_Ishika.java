package Challenges.Challenge5_FunctionsClasses;



public class CarInventory_Ishika
{
    public static void main (String args[])
    {
      Car_Ishika Honda = new Car_Ishika("Honda", 2021, 5 , 25000);
     
     double markPrice = Honda.getmarketPrice();
     
     int carNum = Honda.getnumberCars();
     
     System.out.println("There are " + carNum + "in inventory and they cost " + markPrice);
     
    }
}
