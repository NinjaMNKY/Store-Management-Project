import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
/*
* Creates a regualr ice cream with and without parameters
*/
iceCream i1= new iceCream();
iceCream i2= new iceCream("choclate", 7.50, "large");
/*
* Prints a regualr ice cream with and without parameters
*/
System.out.println(i1);
System.out.println(" ");
System.out.println(i2);
System.out.println(" ");
/*
* Creates a cone ice cream with and without parameters
*/
cone c1= new cone();
cone c2= new cone("strawberry", 8.50, "medium", "oreos", false);
/*
* Prints the cone ice cream with and without parameters
*/
System.out.println(c1);
System.out.println(" ");
System.out.println(c2);
System.out.println(" ");
/*
* Creates a milkshake ice cream with and without parameters
*/
milkshake m1= new milkshake();
milkshake m2= new milkshake("Cookies & Cream", 9.00, "large", true, 3);
  /*
* Prints a milkshake ice cream with and without parameters
*/
System.out.println(m1);
System.out.println(" ");
System.out.println(m2);
System.out.println(" ");  

    // Closes the Scanner object
    input.close();
    
  }
}