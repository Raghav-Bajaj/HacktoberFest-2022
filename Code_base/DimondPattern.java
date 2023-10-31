import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int numRows = sc.nextInt();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            printDiamondPattern(numRows);
        }

        sc.close();
    }

    public static void printDiamondPattern(int numRows) {
        int spaces = numRows / 2;
        int stars = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= numRows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
