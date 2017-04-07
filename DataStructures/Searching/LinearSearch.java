package Searching;

import java.util.Scanner;
import java.util.Random;
 
public class LinearSearch
{
       public static void main(String[] args)
       {
              Scanner scanner = new Scanner(System.in);
              Random ran = new Random();
              System.out.print("How many random numbers would you like to create: ");
              int size = scanner.nextInt();
              System.out.print("What range do you want to use: ");
              int range = scanner.nextInt();
 
              int[] array = new int[size];
             
              for(int i =0; i < array.length; i++) 
              {
                     int random = ran.nextInt(range) + 1;
                     array[i] = random;
              }
             
              System.out.print("What number do you want to search for: ");
              int search = scanner.nextInt();
             
              linearSearch(array,search);
              scanner.close();
       }
      
       public static void linearSearch(int x[], int value)
       {
              boolean found = false;
             
              for(int i = 0; i < x.length && !found; i++)
              {
                     if(x[i] == value)
                     {
                           found = true;
                           System.out.println("The value was found! At position " + i);
                     }
              }
             
              if(!found)
                     System.out.println("The value was not found!");
       }
}
