package Artists;

//Painter.java
enum Medium {
 OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
}

public class Painter extends Artist {
 private Medium medium;

 public Painter(String name, int age, Medium medium) {
     super(name, age, "Visual Arts");
     this.medium = medium;
 }

 @Override
 public void displayInfo() {
	 System.out.println("Painter's Info: ");
     super.displayInfo();
     System.out.println("Medium: " + medium);
 }
}
