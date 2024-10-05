public class milkshake extends iceCream{
//Instance Variables
boolean withWhippedcream;
int levelOfThickness;
/*
*No Argument Constructor if Ice cream is in a milkshake
*/
  public milkshake(){
    withWhippedcream=true;
    levelOfThickness=2;
  }
  /*
*Parameterized Argument Constructor if Ice cream is in a milkshake
*/
public milkshake(String flavor, double price, String size, boolean withWhippedcream, int levelOfThickness){
    super(flavor, price, size);
  this.withWhippedcream=withWhippedcream;
  this.levelOfThickness=levelOfThickness;
}
 /*
 *Accesor method for whippedcreamstatus
 */
public boolean getWithWhippedCream(){
  return withWhippedcream;
}
 /*
 *Accesor method for level of thickness
 */
public int getLevelOfThickness(){
  return levelOfThickness;
}
  /*
  *Mutator method for whipped cream status
  */
public void setwithWhippedcream(boolean withWhippedcream){
  this.withWhippedcream=withWhippedcream;
}
  /*
  *Mutator method for thickness level
  */
public void setLevelOfThickness(int levelOfThickness){
  this.levelOfThickness=levelOfThickness;
}
/*
   *To String for milkshake
   */
public String toString(){
  
  return "Milkshake:\n------------------------------------- "+ super.toString()+ "\nDid you get Whipped Cream?: " +withWhippedcream+ "\nLevel of thickness " +levelOfThickness;
}

}