/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Question6 {
  
  
  public static void main(String[] args) { 
    double cost;
    double mile;
    double gas;
    double resale;
    double owning;
    double resalecost;
    Scanner s1 = new Scanner(System.in);
   System.out.println("Please enter the cost of the new car: ");
   cost=s1.nextDouble();
    System.out.println("Please enter the value for miles driven: ");
   mile=s1.nextDouble();
   System.out.println("Please enter the gas price: ");
   gas=s1.nextDouble();
   System.out.println("Please enter the resale value after 5 years: ");
   resale=s1.nextDouble();
    owning=cost+(5*mile*gas);
    System.out.println("The cost to own the car is "+owning);
    resalecost=cost-resale;
    System.out.println("The cost after resale will be "+resalecost);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
