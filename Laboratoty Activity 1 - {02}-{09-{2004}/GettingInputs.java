
import java.util.Scanner;
public class GettingInputs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.println("Getting the Greater Value");
      System.out.print("Enter first ASCII character: ");
      char firstChar = input.next().charAt(0);
      System.out.print("Enter Second ASCII character: ");
      char secondChar = input.next().charAt(0);
      
      char greaterChar = (char) Math.max(firstChar, secondChar);

      System.out.println ("-".repeat(40));
      System.out.println("The character with greater value is " + greaterChar);  
      System.out.println ("-".repeat(40));

      System.out.println("Showing the ASCII Codes: ");

      System.out.println(firstChar + " : " + (int) firstChar);
      System.out.println(secondChar + " : " + (int) secondChar);

      input.close();
  }
}
