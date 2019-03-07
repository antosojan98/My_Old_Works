/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Password {
  
  public Password() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public static void main(String[] args) { 
    String pass;
    int x;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter password");
    pass=scan.nextLine();
    x=pass.length();
    
    if(x<6)
    {
      System.out.println("Its not valid");
    }
    else
    {
      for(int a=0;a<x;a++){
        if(Character.isUpperCase(pass.charAt(a))){
        }}
for(int b=0;b<x;b++){
        if(Character.isLowerCase(pass.charAt(b))){
        }}
           for(int c=0;c<x;c++){
        if(Character.isDigit(pass.charAt(c))){
        }}
System.out.println("Its a valid password");
      }
    }
  }
  
  /* ADD YOUR CODE HERE */
  



