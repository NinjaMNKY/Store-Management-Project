public class iceCream{
//Instance variables
private String flavor;
private double price;
private String size;
//Constructor Methods
  
/*
   *No-Argument Constructor
   */
public iceCream(){
  flavor="vanilla";
  price=5.00;
  size="medium";
}
  /*
   *Parameterized version of the constructor
   */
public iceCream(String flavor, double price, String size){
  this.flavor=flavor;
  this.price=price;
  this.size=size;
  
  
}
  /*
   *Accessor method for flavor
   */
public String getFlavor(){
  return flavor;
}
   /*
   *Accessor method for Price
   */
public double getPrice(){
  return price;
}
    /*
   *Accessor method for size
   */
public String getSize(){
  return size;
}

  //Mutator methods
  /*
   *mutator method for flavor
   */
public void setFlavor(String flavor){
  this.flavor=flavor;
}
  /*
   *mutator method for Price
   */
public void setPrice(double price){
  this.price=price;
}
  /*
   *mutator method for size
   */
public void setSize(String size){
  this.size=size;
}
/*
   *to String method
   */
public String toString(){
  return "\nFlavor: "+ flavor+"\nPrice: $"+price+ "\nSize: " + size;
}
//Other needed methods

  
}