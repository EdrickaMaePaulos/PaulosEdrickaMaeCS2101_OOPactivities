import java.util.Scanner;
public class Tempconvert {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a Celsius value: ");
    float cel = input.nextFloat();
    float fah = (cel*9/5)+32;
    System.out.printf("%.2f", cel);
    System.out.print(" Celsius is ");
    System.out.printf("%.2f", fah);
    System.out.print(" Fahrenheit\n");


    input.close();



  }
  
  
}
