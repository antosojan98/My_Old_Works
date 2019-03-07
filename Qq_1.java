/**
 * Auto Generated Java Class.
 */

import java.util.*;
public class Qq_1 {
  
  
  public static void main(String[] args) { 
    
    double interest_rate, amount;
    
    double interest_year1, amount_year1, interest_year2, amount_year2, interest_year3, amount_year3;
    
    Scanner S1= new Scanner(System.in);
    System.out.println("Enter Interest Rate:");
    
    interest_rate=S1.nextDouble();
    
    System.out.println("Enter Amount:");
    
    amount=S1.nextDouble();
    
    interest_year1= amount*interest_rate/100;
    
    amount_year1= amount+interest_year1;
    
    System.out.println("Amount of Year 1:"+amount_year1 );
    
    
    interest_year2=  amount_year1*interest_rate/100;
    
    amount_year2= amount+interest_year2;
    
    System.out.println("Amount of Year 2:"+amount_year2 );
    
    interest_year3=  amount_year2*interest_rate/100;
    
    amount_year3= amount_year2+interest_year3;
    
    System.out.println("Amount of Year 2:"+amount_year3 );
  }
  
  /* ADD YOUR CODE HERE */
  
}
