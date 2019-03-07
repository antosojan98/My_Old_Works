/**
 * Auto Generated Java Class.
 */

import java.util.*;
public class Payroll {
  
  String name;
  int id;
  double rate;
  double hour;
  
  
  public Payroll() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public Payroll(String e, int i) {
    
    name=e;
    id=i;
    
  
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public void get_data()
  {
    Scanner s1= new Scanner(System.in);
    System.out.println("Enter rate");
    rate= s1.nextDouble();
    
    Scanner s2= new Scanner(System.in);
    System.out.println("Enter hour:");
    hour= s2.nextDouble();
  }
  
  public double calc()
  {
    return (rate*hour);
    
  }
                     
  public static void main(String[] args) { 
    
    Payroll p1= new Payroll("David", 1256);
    p1.get_data();
   double x= p1.calc();
   System.out.println(p1.name + "    " + p1.id);
   System.out.println(x);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
