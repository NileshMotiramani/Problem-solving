
public class Pattern {
    public static void main(String[] args) {
    //     for (int rows = 0; rows < 3; rows++) {

    //         // First half of diamond
    //         for (int j = rows; j < 3; j++) {
    //             System.out.print(" "); // Print leading spaces
    //         }

    //         for (int columns = 0; columns < Math.pow(2, rows); columns++) {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }

    //     // Second half of diamond
    //     // for (int i = 3 - 1; i >= 1; i--) {
    //     //     // Print spaces
    //     //     for (int j = 3; j > i; j--) {
    //     //         System.out.print(" "); // Print leading spaces
    //     //     }
    //     //     // Print asterisks
    //     //     for (int j = 1; j <= (2 * i - 1); j++) {
    //     //         System.out.print(" * "); // Print asterisks
    //     //     }
    //     //     System.out.println(); // Move to the next line
    //     // }
    // }
    int n = 3; // Height of the top half of the diamond (3 rows)

    // Top half of the diamond
    for (int i = 0; i < n; i++) {
        // Print spaces
        for (int j = i; j < n; j++) {
            System.out.print(" "); // Print leading spaces
        }
        // Print asterisks
        for (int j = 1; j <= Math.pow(2, i); j++) {
            System.out.print(" * "); // Print asterisks
        }
        System.out.println(); // Move to the next line
    }

    // Bottom half of the diamond
    for (int i = n - 1; i >= 1; i--) {
        // Print spaces
        for (int j = n; j > i; j--) {
            System.out.print(" "); // Print leading spaces
        }
        // Print asterisks
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*"); // Print asterisks
        }
        System.out.println(); // Move to the next line
    }
}
    }

