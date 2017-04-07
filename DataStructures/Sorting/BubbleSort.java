package Sorting;
import java.util.Scanner;
import java.util.Random;
 
public class BubbleSort
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
             
              bubbleSort(array);
              System.out.print("The array in ascending order is: " + array);
              scanner.close();
       }
      
       public static void bubbleSort(int x[])
       {
              boolean swap;
              do
              {
                     swap = false;
                     for(int i =0; i < x.length-1; i++)
                     {
                           if(x[i] > x[i+1])
                           {
                                  int temp = x[i];
                                  x[i] = x[i+1];
                                  x[i+1] = temp;
                                  swap = true;
                           }
                     }
              }while(swap);
       }
}