package Artists;

//Dancer.java
enum DanceStyle {
 BALLET, HIPHOP, JAZZ, CONTEMPORARY
}

public class Dancer extends Artist {
 private DanceStyle danceStyle;

 public Dancer(String name, int age, DanceStyle danceStyle) {
     super(name, age, "Dance");
     this.danceStyle = danceStyle;
 }

 @Override
 public void displayInfo() {
	 System.out.println("Dancer's Info: ");
     super.displayInfo();
     System.out.println("Dance Style: " + danceStyle);
 }
}