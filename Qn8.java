import java.util.*;
public class Qn8 {
  
  
  public static void main(String[] args) { 
   
    int n;
    Scanner s1=new Scanner(System.in);
     System.out.println("Enter your array limit");
     n=s1.nextInt(); 
     int a[] =new int[n];
     int b[] =new int[n];
     int c[] =new int[n];
     
      
     for(int i=0;i<n;i++)
    {
     System.out.println("Enter values for 1st Order");
     a[i]=s1.nextInt(); 
     }
      for(int j=0;j<n;j++)
    {
     System.out.println("Enter values for 2nd Order");
     b[j]=s1.nextInt(); 
     }
    System.out.print("Final amount ordered: ");
     for(int k=0;k<n;k++)
     {
      c[k]=a[k]+b[k];
     
      System.out.print(c[k]+"\t");
     }
     
      
     
  }
  
  /* ADD YOUR CODE HERE */
  
}
