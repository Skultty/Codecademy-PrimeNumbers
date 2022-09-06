
import java.util.ArrayList;


class PrimeDirective {

    public boolean isPrime(int number) {

        if (number == 2) {
            return false;
        } else if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        PrimeDirective pd = new PrimeDirective();

        for (int number : numbers) {
            if (pd.isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        ArrayList<Integer> result;

        result = pd.onlyPrimes(numbers);
        System.out.println(result);
    }

}
