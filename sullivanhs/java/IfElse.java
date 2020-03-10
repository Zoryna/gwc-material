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

    //TODO change the x and y values to test the if-else statement
  }
}
