/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Q4 {
  
  
  public static void main(String[] args) { 
    String str;
    Scanner scan=new Scanner(System.in);
      System.out.println("Enter your String");
    do{
      
      
      str=scan.nextLine();
      String s=str.toLowerCase();
      int x=s.length();
      String a=s.substring(0,1);
      String b=s.substring(x-1,(s.length()));
      
if((b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u"))&&(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")))
         System.out.println("The first and last letter is a vowel"); 
      
      
      else 
        System.out.println("The first or last letter is not a vowel");
      
    }while(!str.equals("done"));
  }
  
  /* ADD YOUR CODE HERE */
  
}
