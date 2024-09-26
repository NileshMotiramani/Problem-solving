
public class StrongNumbers {
    public static void main(String[] args) {

        System.out.println("Strong numbers from 1 to 1000:");

        for (int number = 0; number <= 1000; number++) {
            if (isStrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNum = number;
        while (number > 0) {
            int digit = number % 10; // last Digit
            sum += factorialNumber(digit);
            number = number / 10; // Remove the last digit
        }
        return sum == originalNum;
    }

    public static int factorialNumber(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
