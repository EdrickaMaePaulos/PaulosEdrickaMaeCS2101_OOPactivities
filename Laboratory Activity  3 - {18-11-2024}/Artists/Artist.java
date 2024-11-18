package Artists;

public class Artist {
 private String name;
 private int age;
 private String specialty;

 public Artist(String name, int age, String specialty) {
     this.name = name;
     this.age = age;
     this.specialty = specialty;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getSpecialty() {
     return specialty;
 }

 public void displayInfo() {
     System.out.println("Artist Name: " + getName());
     System.out.println("Age: " + getAge());
     System.out.println("Specialty: " + getSpecialty());
 }
}
