import java.util.Scanner;

public class GettingGreater {
  public static void main(String[]args) {
    int year;
    String genre; 
    String album;
    String song_title;
    String artist;

    try (Scanner input = new Scanner(System.in)){
      System.out.print("Enter the year\t\t: ");
      year = input.nextInt();
      input.nextLine();
      System.out.print("Enter the genre\t\t: ");
      genre = input.nextLine();
      System.out.print("Enter the Album\t\t: ");
      album = input.nextLine();
      System.out.print("Enter the Song Title\t: ");
      song_title = input.nextLine();
      System.out.print("Enter the Artist\t: ");
      artist = input.nextLine();

      System.out.println("\n" + "-".repeat(40));
      System.out.println("SONG DETAILS");
      System.out.println("-".repeat(40) + "\n");
      System.out.println("Year Released\t: " + year);
      System.out.println("Genre\t\t: " + genre);
      System.out.println("Album\t\t: " + album);
      System.out.println("Title\t\t: " + song_title);
      System.out.println("Artist\t\t: " + artist);}

    catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
