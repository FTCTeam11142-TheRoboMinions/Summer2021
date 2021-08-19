package Challenges.Challenge5_FunctionsClasses;


/**
 * Write a description of class C5_Car_Nikhil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C5_Car_Nikhil
{
    //initializing variables
    private String carmake;
    private int releaseyear;
    private int carsinv;
    private double avgprice;
        
    //assigning variables
    public C5_Car_Nikhil (String brand, int year, int inv, double price )
    {
        carmake  = brand;
        releaseyear = year;
        carsinv = inv;
        avgprice = price;
    
    }
    
    //Get commands
    public String getCarMake()
    {
        return carmake;
    }
    
    public int getReleaseYear()
    {
        return releaseyear;
    }

    public int getCarsInv()
    {
        return carsinv;
    }
    
    public double getAvgPrice()
    {
        return avgprice;
    }
    
    //setter
    public int setCarsInv(int inv)
    {
        carsinv = inv;
        return 0;
    }
    
}

