/**
 * Auto Generated Java Class.
 */

import java.util.*;
public class Qq_2 {
  
  
  public static void main(String[] args) { 
    
  String name, month;
  int year, day;
  Scanner S1=new Scanner(System.in);
  System.out.println("Please enter your name:");
  name=S1.nextLine();
    
  System.out.println("Please enter your year of birth");
  year=S1.nextInt();
  
  
  Scanner S2=new Scanner(System.in);
  
  System.out.println("Please enter the month in which you were born:");
  month=S2.nextLine();
  
  
  System.out.println("Please enter the day on which you were born:");  
  day=S2.nextInt();
  
  int age=2016-year;
  
  System.out.println("Hello "+name+" you are "+ age + " year old");
  System.out.println(name+" was born in "+month+" on the day "+day+" of "+ year);
  }
  
  /* ADD YOUR CODE HERE */
  
}
