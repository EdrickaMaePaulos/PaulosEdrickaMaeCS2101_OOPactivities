import java.util.Scanner;

public class MultiplicationTable {

    public static int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }


    public static void displayTable(int[][] table) {
        System.out.println("Multiplication Table:");
        for (int[] row : table) {
            for (int number : row) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();

        int[][] table = multiplicationTable(size);
        displayTable(table);

        input.close();
    }
}
