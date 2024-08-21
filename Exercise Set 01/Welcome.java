import java.util.Scanner;

class Welcome{
  public static void main(String[]args){
    System.out.println("\nWelcome to CS 211: Object-oriented Programming!");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.println("This course will be fun, " + name + "!\n");
    input.close();
    
  }
}