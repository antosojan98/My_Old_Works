/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class NumberAboveAverage {
  

  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    double temp[]=new double[10];
    int days=0;
        double total=0;
        
  
  for(int i=0;i<10;i++)
  {
    System.out.println("Enter your temperature");
    temp[i]=scan.nextDouble();
 
    total=total+temp[i];
    
    
  }
   
    double newavg=total/10;
    
    
  for(int j=0;j<10;j++) {
      if(newavg>total){
      days++;}
    }
    
    System.out.println("No of days greater than average "+days);
    
    
  
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
