
public class cone extends iceCream{
 //instance variables
  private String toppings;
  private boolean hasSugarCone;
  /*
   *No-Argument Constructor if the ice cream is a cone
   */
  public cone(){
  toppings= "no toppings";
  hasSugarCone= false; 
}
/*
   *Parameterized version of the constructor for the cone
   */
public cone(String flavor, double price, String size, String toppings, boolean hasSugarCone){
  super(flavor, price, size);
  this.toppings=toppings;
  this.hasSugarCone=hasSugarCone;
}
  
  
  /*
   *Accessor method for toppings
   */
public String getToppings(){
  return toppings;
}
   /*
   *Accessor method for hasSugarCone
   */
public boolean hasSugarCone(){
  return hasSugarCone;
}

  //Mutator Methods
  
  /*
   *mutator method for toppings
   */
public void setToppings(String toppings){
  this.toppings=toppings;
}
  /*
   *mutator method for if the ice cream has a sugar cone
   */
public void setHasSugarCone(boolean hasSugarCone){
  this.hasSugarCone=hasSugarCone;
}

/*
   *To String for cone
   */
public String toString(){
  
  return "Cone:\n------------------------------------- "+super.toString() +"Toppings: " +toppings+ "\nDid you get a Sugarcone? " +hasSugarCone;
}




  
}