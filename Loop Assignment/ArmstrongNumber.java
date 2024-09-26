import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int numberOfDigit = input.length();
        int sum = 0;

        for (int i = 0; i < numberOfDigit; i++) {
            int a = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += Math.pow(a, numberOfDigit);
        }

        if (sum == Integer.parseInt(input)) {
            System.out.println(input + " is an Armstrong number.");
        } else {
            System.out.println(input + " is not an Armstrong number.");
        }
    }
}
