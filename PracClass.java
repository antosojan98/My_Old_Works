/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class PracClass {
  String name;
  double price;
  int quantity;
  
  public PracClass() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public PracClass(String n,double p,int q){
  this.name=n;
  this.price=p;
  this.quantity=q;
  
  }
  public String getName(){
  return(name);
  }
  public double getPrice(){
  return(price);
  }
  public int getQuantity(){
  return(quantity);
  }
  public double get_value(){
    return(this.price*this.quantity);
   }
  
  public static void main(String[] args) { 
    PracClass p=new PracClass("Stapler",2.25,15);
    PracClass p1=new PracClass("Paper",32.99,255); 
     PracClass p2=new PracClass("Binder",4.75,9);
     System.out.println("Name"+"\t"+"Price"+"\t"+"Quantity"+"\t"+"Value");
     System.out.println(p.getName()+"\t"+p.getPrice()+"\t"+p.getQuantity()+"\t"+p.get_value());
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
