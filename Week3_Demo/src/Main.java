/*
 * Bradley Biorn
 * This is my first java program using GIT in Eclipse
 */

public class Main 
{	
   public static void main(String[] args)
   {
      Sum sum = new Sum(4,3);	  
	  
	  sum.calcSum();
      goodbye();
   }
   
   private static void goodbye()
   {
	   System.out.println("Thank you for testing this program!\n\nEND OF PROGRAM");
   }
}
