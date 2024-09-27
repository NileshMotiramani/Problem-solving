public class Pattern {
    public static void main(String[] args) {

        // Upper part of the pattern
        for (int rows = 1; rows <= 3; rows++) {
            // Print leading spaces
            for (int column = rows; column < 3; column++) {
                System.out.print("  ");
            }

            // Print stars with spaces between them
            for (int column = 1; column <= Math.pow(2, rows-1); column++) {
                if (column % 2 == 0) {
                    System.out.print(" ");
                    
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower part of pattern
        for (int rows = 3 - 1; rows >= 1; rows--) {
            // Print leading spaces
            for (int j = 3; j > rows; j--) {
                System.out.print("  ");
            }

            // Print stars with spaces between them
            for (int j = 1; j <= Math.pow(2, rows-1); j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                    
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
