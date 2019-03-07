/**
 * Auto Generated Java Class.
 */
public class Person {
  String direction;
  int position;
  
  public Person() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public Person(int a){
  position=a;
  //putting initial direction as west
  direction="west";
  }
  public void turn(){
    //changes west to east
    if(direction.equals("west")){
    direction="east";}
    //changes east to west
    else{
    direction="west";}
     }
  public void move(){
    //increases position by 1
  position++;
  }
  public static void main(String[] args) { 
    //putting the initial position as 10
    Person p=new Person(10);
    p.turn();
    p.move();
    p.turn();
    System.out.println("Direction is "+p.direction);
    System.out.println("Position is "+p.position);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
