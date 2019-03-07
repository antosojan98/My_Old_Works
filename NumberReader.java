/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class NumberReader {
  
  
  public static void main(String[] args) { 
    int x,y,z;
    
    Scanner s1=new Scanner(System.in);
    
    System.out.println("Enter your first number: ");
    x=s1.nextInt();
    System.out.println("Enter your second number: ");
    y=s1.nextInt();
    System.out.println("Enter your third number: ");
    z=s1.nextInt();
    
    if(x==y && y==z && x==z)
      System.out.println("All numbers are same");
    else
    if(x!=y && y!=z && x!=z)
      System.out.println("All numbers are different");
    
    else
      System.out.println("Neither are same");
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
