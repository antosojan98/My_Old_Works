/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Q5 {
  
  
  public static void main(String[] args) { 
    int marks=0;
    int a=0,b=0,c=0,d=0,f=0,total=0;
    Scanner scan=new Scanner(System.in);
    
    do{
      System.out.println("Enter your marks");
      marks=scan.nextInt();
      if(marks>90 && marks<100)
        a++; 
      
      if(marks>80 && marks<90)
        b++;
     
      if(marks>70 && marks<80)
        c++;
     
      if(marks>60 && marks<70)
        d++;
      
      if(marks<0 && marks<60)
        f++;
      total=a+b+c+d+f;
    }while(marks!=-1);
    System.out.println("Total Number of grades "+total);
    System.out.println("Number of A's= "+a);
    System.out.println("Number of B's= "+b);
    System.out.println("Number of C's= "+c);
    System.out.println("Number of D's= "+d);
    System.out.println("Number of F's= "+f);
  }
  
  /* ADD YOUR CODE HERE */
  
}
