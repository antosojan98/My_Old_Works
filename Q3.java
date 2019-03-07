/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Q3 {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    int n;
    
    System.out.println("Enter your triangle area");
    n=scan.nextInt();
    if(n>=0 && n<=50){
    for (int k = 0; k < n; k++) {
       
         for (int l = 0; l < k-1; l++) {
             System.out.print("*");
         }
         
         System.out.println("*");
     }
    
     for (int i = 0; i < n; i++) {
       
         for (int j = 0; j < n-i-1; j++) {
             System.out.print("*");
         }
         
         System.out.println("*");
     }
    }
    else
      System.out.println("Cannot be calculated");
  }
  
  /* ADD YOUR CODE HERE */
  
}
