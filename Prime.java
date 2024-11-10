import java.util.Scanner;
//we can check till √n because a larger factor of n must be a multiple of a smaller factor that has been already checked. 
class Prime{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String args[])
    {
        int num = 2;
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
    }
}