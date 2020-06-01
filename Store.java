//Name: Joshua Perez
//Final Project: SuperClass 'Store'

import java.util.Scanner;
import java.text.DecimalFormat;

public class Store                                                                        //SuperClass
{
//Variables
   protected String name;
   protected int employees;
   protected int avgCustomers;
   protected double weekEarnings;

//Constructor (Default)
   public Store()
   {
      name = "";
      employees = 0;
      avgCustomers = 0;
      weekEarnings = 0.0;
   }
   
//Constructor                                                                             //Overloading
   public Store(String n, int e, int avgC, double wE)
   {
      name = n;
      employees = e;
      avgCustomers = avgC;
      weekEarnings = wE;
      
   }

//Mutators
   public void setAvgCustomers(int c)
   {
      avgCustomers = c;
   }
   public void setName(String n)
   {  
      name = n;
   }
   public void setEmployees(int e)
   {
      employees = e;
   }
   public void setWeekEarnings(double wE)
   {
      weekEarnings = wE;
   }
   
//Accessors
   public int getAvgCustomers()
   {
      return avgCustomers;
   }
   public String getName()
   {
      return name;
   }
   public int getEmployees()
   {
      return employees;
   }
   public double getWeekEarnings()
   {
      return weekEarnings;
   }
   
                                                                                             //Static Method
   public static void weekCustomSpending(int avgC, double wE)
   {
      DecimalFormat num = new DecimalFormat("###,###.00");
      
      System.out.println("Your calculated average sale per customer for this week is $" + num.format(wE / avgC));
   }


//Display(toString)
   public String toString()
   {
      DecimalFormat num2 = new DecimalFormat("#,###");
      
      String str = "Your business is a store"
                     + "\nThe name is " + name
                     + "\nThe number of employees is " + num2.format(employees)
                     + "\nThe average customer count is " + num2.format(avgCustomers);
      
      return str;
   }
}