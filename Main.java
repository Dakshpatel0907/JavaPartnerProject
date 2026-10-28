import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] createArray(int size) {
        Random rand = new Random();
        int[][] arr = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                arr[row][col] = rand.nextInt(10) + 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
            input.close();
            return;
        }

        int[][] arr = createArray(size);

        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

