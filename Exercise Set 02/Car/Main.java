package Car;

public class Main {
  public static void main(String[] args) {
    Car ex1 = new Car("red", 19999.85, 'm');
    System.out.println(ex1.toString()); // Outputs: Car (red) - P19999.85 - medium
    Car ex2 = new Car("blue", 50000.00, 'l');
    System.out.println(ex2.toString());// Outputs: Car (blue) - P50000.00 - large
  }
}