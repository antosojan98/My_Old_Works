/**
 * Auto Generated Java Class.
 */
import java.util.*;
import java.text.*;
public class Q1 {
  
  
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in);
    double b,f,soda;
    double totalb,totalf,totals,total=0.0,tax,totaltax;
    
    System.out.println("Enter the amount of burgers:");
    b=s.nextDouble();
    
    System.out.println("Enter the amount of fries:");
    f=s.nextDouble();
    
    System.out.println("Enter the amount of sodas:");
    soda=s.nextDouble();
    
    totalb=1.69*b;
    totalf=1.09*f;
    totals=0.99*soda;
    
    total=(totalb+totalf+totals);
    
    tax=0.065*total;
    
    totaltax=total+tax;
    
    DecimalFormat d=new DecimalFormat("$###,#0.00");
    
    System.out.println("Total before tax: "+d.format(total));
    System.out.println("Tax: "+d.format(tax));
    System.out.println("Final Total: "+d.format(totaltax));
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
