
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        int previousPrime = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                if (previousPrime != 0 && i - previousPrime == 2) {
                    System.out.println("(" + previousPrime + ", " + i + ")");
                }
                previousPrime = i;
            }
        }
    }

    static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
