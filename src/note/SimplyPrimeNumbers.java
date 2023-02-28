package note;

public class SimplyPrimeNumbers { // простые числа
    public static void main(String[] args) {
        SimplyPrimeNumbers.isPrime(1); // false
        SimplyPrimeNumbers.isPrime(2); // true
        SimplyPrimeNumbers.isPrime(3); // true
        SimplyPrimeNumbers.isPrime(4); // false
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        var divider = 2;

        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }

            divider++;
        }

        return true;
    }
}

