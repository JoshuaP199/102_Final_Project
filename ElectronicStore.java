//Name: Joshua Perez
//Final Project: SubClass 'ElectronicStore'

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectronicStore extends Store implements Business                           //SubClass
{
//Variables
   private int stock;
   private static String storeType = "Electronics";                                      //Static Member

//Constructor (Default)
   public ElectronicStore()
   {
      super();
      stock = 0;
   }

//Constructor                                                                            //Overloading
   public ElectronicStore(int s)
   {
      super();
      stock = s;
   }

   public ElectronicStore(String n, int e, int avgC, double wS, int s)
   {
      super(n, e, avgC, wS);
      stock = s;
   }   

//Mutators
   public void setStock(int s)
   {
      stock = s;
   }
      
//Accessors
   public int getStock()
   {
      return stock;
   }

                                                                                  //Abstracts (clean this up)
   public String getBusinessType()  
   {
      return "store";   //Orignally was going to be used to differentiate from store, resturant, ect. classes(didn't have time to make other classes)
   }
   public double avgPrice()
   {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("Enter the average price of items in your store: ");
     double avg = keyboard.nextDouble();
     
     return avg;
   }

   
//Display(toString)
   public String toString()                                                            //Overriding
   {
      DecimalFormat num = new DecimalFormat("###,###.00");
      DecimalFormat num2 = new DecimalFormat("#,###");
      
      String str = "\nYour " + storeType + " " + getBusinessType() + " is named " + name
                     + "\nYou have " + num2.format(employees) + " current employees working for you" 
                     + "\nCurrent stock is " + num2.format(stock) + " items"
                     + "\nAverage price of an item is $" + num.format(avgPrice())
                     + "\nAverage customer count this week was " + num2.format(avgCustomers)+ "\n";

      
      return str;
   }
}