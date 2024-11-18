package Artists;

//Writer.java
enum WritingStyle {
 FICTION, NONFICTION, POETRY, DRAMA
}

public class Writer extends Artist {
 private WritingStyle writingStyle;

 public Writer(String name, int age, WritingStyle writingStyle) {
     super(name, age, "Literature");
     this.writingStyle = writingStyle;
 }

 @Override
 public void displayInfo() {
	 System.out.println("Writer's Info: ");
     super.displayInfo();
     System.out.println("Writing Style: " + writingStyle);
 }
}
