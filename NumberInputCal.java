/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class NumberInputCal {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    int x=0;
    int sum=0,count=0,values=0;
    while(x<=0){
      x= scan.nextInt();
      
      sum=sum+x;
      count++;
      if((x%2)==0){
        values++;}
      
      
      
      
    }
    int average=sum/count;
    System.out.println("Sum "+sum);
    System.out.println("Number of inputs "+count);
    System.out.println("Average "+average);
    System.out.println("Even numbers "+values);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
