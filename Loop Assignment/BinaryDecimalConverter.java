import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryInput = sc.nextLine();
        int decimalOutput = binaryToDecimal(binaryInput);
        System.out.println("The decimal equivalent of binary " + binaryInput + " is: " + decimalOutput);
    }

    public static int binaryToDecimal(String binary) {

        int base = 1;
        int decimal = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base = base * 2;
        }

        return decimal;

    }
}
