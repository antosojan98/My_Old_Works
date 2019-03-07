/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Q2 {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    String sentence;
    
    System.out.println("Enter your sentence");
    sentence=scan.nextLine();
    
    int a=sentence.length();
    String b=sentence.substring(a-1,(sentence.length()));
    
    
   if(a%2==0 && b.equals("?"))
     System.out.println("yes we got it");
   
   if(a%2!=0 && b.equals("?"))
     System.out.println("Sorry we didn't get it");
   
   else if(a%2!=0 && !b.equals("?"))
     System.out.println("Try Again");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
