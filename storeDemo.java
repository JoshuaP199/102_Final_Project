//Name: Joshua Perez
//Store Demo

import java.util.*;

public class storeDemo
{
   public static void main(String[] args)       
   {
      Scanner keyboard = new Scanner(System.in);
      int employees, stock, avgCustomers;
      double weekEarnings;
      String name;
      
      System.out.println("Enter your electronics store's information down below.");
      
      try                                                     
      {         
         System.out.print("\nEnter the name of your store: ");
         name = keyboard.nextLine();
         
         System.out.print("Enter the amount of current employees: ");
         employees = keyboard.nextInt();
         
         keyboard.nextLine();

         System.out.print("Enter the amount of stock in your store: ");
         stock = keyboard.nextInt();
         
         keyboard.nextLine();
         
         Store s = new ElectronicStore(stock);                 //Polymorphism
         
         System.out.print("Enter the average amount of customers you had a week: ");
         avgCustomers = keyboard.nextInt();
         
         System.out.print("Enter this weeks total earnings($) from sales: ");
         weekEarnings = keyboard.nextDouble();
         
         s.setName(name);
         s.setEmployees(employees);
         s.setAvgCustomers(avgCustomers);
         s.setWeekEarnings(weekEarnings);
               
         System.out.print(s);
         s.weekCustomSpending(avgCustomers, weekEarnings);
      }
      
      catch(InputMismatchException e)                          //Exception
      {
         System.out.println("\nError: Entered a character instead of a number");
      }
      
      catch(Exception e)                                       //Exception
      {
         System.out.println("Error: " + e.getMessage());
      }
   }
}