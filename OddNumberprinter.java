/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class OddNumberprinter {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    
    int number;
    System.out.println("Please specify the odd number till it needs to be printed");
    number=scan.nextInt();
   
    for(int i=0;i<=number;i++)
    {
     if(i%2!=0)
       System.out.println(i);
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
