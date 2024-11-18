package Artists;

public class ArtistDemo {
 public static void main(String[] args) {
	 Artist artist = new Artist("Lindtsey Stacey Aubrey Sevilleja", 21, "Music");
     artist.displayInfo();
     System.out.println();
	 
     Artist painter = new Painter("Vincent van Gogh", 100, Medium.OIL);
     painter.displayInfo();
     System.out.println();

     Artist singer = new Singer("Ma. Nicolette Vergara", 23, Genre.POP);
     singer.displayInfo();
     System.out.println();

     Artist writer = new Writer("William Shakespeare", 100, WritingStyle.DRAMA);
     writer.displayInfo();
     System.out.println();

     Artist dancer = new Dancer("Sheena Mae Catacutan", 20, DanceStyle.HIPHOP);
     dancer.displayInfo();
 }
}
