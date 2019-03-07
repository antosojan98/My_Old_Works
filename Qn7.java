import java.util.*;
public class Qn7 {
  
  double temp1,temp2;
  String ch1,ch2;
  public Qn7() { 
      this.temp1=0.0;
    this.temp2=0.0;
    
  }
  public Qn7(double t1,double t2) { 
    t1=temp1;
    t2=temp2;
   
  }
 
  public Qn7(double t1,String p1) { 
    t1=temp1;
    p1=ch1;
  }
  public Qn7(String p2,double t2){
    
    t2=temp2;
    p2=ch2;
  }
  public double temper()
  {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter your temperature:");
    temp1=s1.nextDouble();
    return temp1;
  }
  public String temper2()
  {
    Scanner s2=new Scanner(System.in);
    System.out.println("Enter your Scale");
    ch1=s2.nextLine();
    if(ch1.equals("c"))
    {
      return ch1;
    }
    else
      if(ch1.equals("f"));{
      return ch1;
    }
    }
  public void compare1()
  {
    if(temp1==temp2)
    {
      System.out.println("They are equal");
    }
    else 
    {
      System.out.println("They are not equal");
    }
  }
  public void greater()
  {
    if(temp1>temp2)
    {
      System.out.println("1st Temperature is greater"+temp1);
    }
    else
    {
      System.out.println("2nd Temperature is greater"+temp2);
    }}
      public void lesser()
      
        {
    if(temp1>temp2)
    {
      System.out.println("2nd Temperature is smaller"+temp2);
    }
    else
    {
      System.out.println("1st Temperature is smaller"+temp1);
    }}
      public double y()
      {
        double u;
        u=(5*(temp1-32)/9);
        return u;
      }
      public double z()
      {
        double v;
        v=(9*(temp2-32)/9);
        return v;
      }
  public static void main(String[] args) { 
    
     Qn7 l=new Qn7();
 l.temper();
 l.temper2();
  l.compare1();
  l.greater();
  l.lesser();
  }
 
  
  
  /* ADD YOUR CODE HERE */
  
}
