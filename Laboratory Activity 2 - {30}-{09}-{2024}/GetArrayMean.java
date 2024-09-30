import java.util.Scanner;

public class GetArrayMean {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements must be greater than 0.");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
        }

        double mean = getArrayMean(numbers);

        System.out.printf("Mean of array is: %.2f%n", mean);

        input.close();
    }

    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}