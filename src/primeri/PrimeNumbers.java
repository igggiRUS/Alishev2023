public class PrimeNumbers { // простые числа
    public static void main(String[] args) {
        PrimeNumbers.isPrime(1); // false
        PrimeNumbers.isPrime(2); // true
        PrimeNumbers.isPrime(3); // true
        PrimeNumbers.isPrime(4); // false
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

