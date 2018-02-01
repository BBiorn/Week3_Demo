
public class Calc 
{
   private int num1, num2;
  
   public Calc(int number1, int number2)
   {
	   num1 = number1;
	   num2 = number2;
   }
   
   public void sum()
   {
	   System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
   }
   
   public void diff()
   {
	   System.out.println(num1 + " subtracted from " + num2 + " is: " + (num2 - num1));
   }
   
   public void mult()
   {
	   System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
   }
   
   public void div()
   {
	   if(num2 != 0)System.out.println("The division of " + num1 + " over " + num2 + " is: " + (num1 / num2));
	   else System.out.println("The division of " + num1 + " over " + num2 + " cannot be computed because of divide by zero error.");
   }
}
