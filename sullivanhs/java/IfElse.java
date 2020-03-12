/*
Learn how to code if-else statements
in Java
*/

public class IfElse
{
  public static void main (String[] args)
  {
    /*
    Using one equals sign assigns a value to the object
    A String and an int are variables
    and you have to give them a value
    */

    String message = "This is a String";
    String anotherMessage="Hello";
    int x = 1;
    int y = 1;

    System.out.println(message); //this will print out the sentence you assigned to message

    /*
    if-else statements need a conditional
    A conditional is something that is true or false
    and it is inside the paranthesis
    */
    if (x == y) //two equals signs compares the values in the object
      System.out.println("These two int values are equal!");
    else
      System.out.println("These two int values are NOT equal!");

    if (message.equals(anotherMessage))
      System.out.println("These messages are equal");
    else
      System.out.println("These messages are NOT equal");

    if (x==1)
      System.out.println("x is equal to 1");
    else if (x>1)
      System.out.println("x is greater than 1");
    else if (x<1)
      System.out.println("x is less than 1");

    //TODO change the x and y values to test the if-else statement
  }
}
