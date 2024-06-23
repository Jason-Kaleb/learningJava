package calculateprimenumbersingivenrange;

public class CalculatePrimeNumbersInGivenRange
{
    public static void main(String[] args)
    {
        int numberOfPrimes = 0;
        for (int i = 2; i <= 100; i++)
        {
           if (isPrime(i))
               numberOfPrimes++;
        }
        System.out.println("Number of Primes between 1 & 100: " + numberOfPrimes);
    }
    
    static boolean isPrime(int x)
    {
        if (x <= 1)
            return false;
        
        if (x == 2)
            return true;
        
        if (x % 2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(x); i += 2)
        {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
