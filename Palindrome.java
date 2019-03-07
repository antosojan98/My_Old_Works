/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Palindrome {
  
  
  public static void main(String[] args) { 
    String myString;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string");
    myString=scan.nextLine();
        String myStringReversed = new StringBuilder(myString).reverse().toString();

        if (myString.equals(myStringReversed)) {
            System.out.println("Yes its a plaindrome");
        }
        else {
            System.out.println("No its not a palindrome");
        }
  }
  
  /* ADD YOUR CODE HERE */
  
}
