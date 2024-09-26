import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // if (num2 > num1) {
        //     System.out.println(gcdNumbers(num2, num1));

        // } else {
            System.out.println(gcdNumbers(num1, num2));
        // }
    }

    public static int gcdNumbers(int max, int min) {

        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        return max;
    }
}
