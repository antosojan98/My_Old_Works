import java.util.*;
import java.lang.String.*;
public class Password1 {
  
 
  public Password1() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public static void main(String[] args) { 
     Scanner s1=new Scanner(System.in);
    String a;
     System.out.println("Enter the String:");
     a=s1.nextLine();
     int x=a.length();
    if(x>=6)
    {
      System.out.println("Success have 6 characters or more:");
    }
    else{
      System.out.println("Less characters:");
    }
   
    String s2=a.substring(0);
    {
      char ch=a.charAt(x);
      if(ch>='A'&&ch<='Z')
     {
        
        System.out.println("Yes have uppercase ");
      }
   
      else
      {
          System.out.println("No upper case");
      }
        if(ch>=0&&ch<=9)
        {
          System.out.println("yes have number");
        }
        else
        {
           System.out.println("no dont have number");
        }
          
  
   
    }
  }
}
  
  /* ADD YOUR CODE HERE */
  

