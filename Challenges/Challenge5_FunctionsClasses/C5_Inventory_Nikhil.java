package Challenges.Challenge5_FunctionsClasses;


/**
 * Write a description of class C5_Inventory_Nikhil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C5_Inventory_Nikhil
{
    public static void main(String args[])
       {
        //BMW Car
        C5_Car_Nikhil BMW;
        BMW = new C5_Car_Nikhil("BMW", 2021, 100, 50000.00); 
        // BMW = Car Make, 2021 = Release Date, 100 = Numb of cars in the inv, 50000.00 = Avg cost
        
        int inv = BMW.getCarsInv();
        
        double price = BMW.getAvgPrice();
        
        String brand = BMW.getCarMake();
        
        //Honda Car
        C5_Car_Nikhil Honda;
        Honda = new C5_Car_Nikhil("Honda", 2020, 152, 38000.00);
        // Honda = Car Make, 2020 = Release Date, 152 = Numb of cars in the inv, 38000.00 = Avg Cost
        
        String brand2 = Honda.getCarMake();
        
        int inv2 = Honda.getCarsInv();
        
        double price2 = Honda.getAvgPrice();
        
        System.out.println("There are " + inv + " " + brand + " cars in our inventory right now. Each car costs " + price);
        //BMW Output
        
        System.out.println("There are " + inv2 + " " + brand2 + " cars in our inventory right now. Each car costs " + price2);
        //Honda Output
        
        int BMWsell = 2;
        
        inv = inv-2;
        
        BMW.setCarsInv(inv);
        
        System.out.println(BMWsell + " BMW cars have been sold so far.");
        System.out.println ("There are a total of " + BMW.getCarsInv() + " BMW cars left." );
        
        
        
        
        
        
       }
}
