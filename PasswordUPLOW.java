/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class PasswordUPLOW {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    String password;
    System.out.println("Enter your password");
    password=scan.nextLine();
    //checks if there is a lower case letter
    boolean hasUppercase = !password.equals(password.toLowerCase());
    //checks if there is a upper case letter
boolean hasLowercase = !password.equals(password.toUpperCase());

if(!hasUppercase)System.out.println("Must have an uppercase Character");//executes if the password doesn't have uppercase
if(!hasLowercase)System.out.println("Must have a lowercase Character");//executes if the password doesn't have lowercase
else
  System.out.println("The password is alright");


    
  }
  
  /* ADD YOUR CODE HERE */
  
}
