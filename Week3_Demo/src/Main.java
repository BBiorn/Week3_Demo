/*
 * Bradley Biorn
 * This is my first java program using GIT in Eclipse
 */

import java.util.Scanner;

public class Main 
{	
   public static void main(String[] args)
   {
	  int[] nums = new int[2]; // holds two values to be summed
	  Scanner keyboard = new Scanner(System.in); //used to take in data from the user
	  System.out.print("Please enter an integer: ");
	  nums[0] = keyboard.nextInt();
	  System.out.print("Please enter another integer: ");
	  nums[1] = keyboard.nextInt();
	  
      Calc calc = new Calc(nums[0],nums[1]);	  
	  
	  calc.sum();
	  calc.diff();
	  calc.mult();
	  calc.div();
      goodbye();
      keyboard.close();
   }
   
   private static void goodbye()
   {
	   System.out.println("Thank you for testing this program!\n\nEND OF PROGRAM");
   }
}
