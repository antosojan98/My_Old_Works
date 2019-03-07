/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class P1Q3 {
  
  
  public static void main(String[] args) { 
    
    Scanner sc=new Scanner(System.in);
    
    int counter=0;    
    String input,temporary;
    
    System.out.println("Please enter a sentence.");    
    input=sc.nextLine();
    
    int length=input.length();
    
    //chops and prints
        
    while(counter<input.length()){
    
      if (input.charAt(counter)==' ' || input.charAt(counter)=='\'' ){
      
        temporary=input.substring(0, counter);
        input=input.substring(counter+1);
        
        temporary=temporary.replace("\"","");
        temporary=temporary.replace(".","");  
        temporary=temporary.replace(",","");
        temporary=temporary.replace("!","");
        temporary=temporary.replace("?","");
        temporary=temporary.replace(":","");
        temporary=temporary.replace(";","");
                  
        System.out.println(temporary);
        counter=0;
      }       
      counter++;    
    }
   
    //Prints the last word not covered in the loop
   
        input=input.replace("\"","");
        input=input.replace(".","");  
        input=input.replace(",","");
        input=input.replace("!","");
        input=input.replace("?","");  
        input=input.replace(":",""); 
        input=input.replace(";",""); 
    
    System.out.println(input);
   }
  
  /* ADD YOUR CODE HERE */
  
}
