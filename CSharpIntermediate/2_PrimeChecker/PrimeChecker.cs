using System;
using System.Numerics;

namespace _2_PrimeChecker
{
    class PrimeChecker
    {
        public static bool IsPrime(BigInteger number)
        {
            if (number == 1 || number==0) return false;
            if (number == 2) return true;

            BigInteger half = number/2;
            for (int i = 2; i <= half; ++i)
            {
                if (number % i == 0) return false;
            }

            return true;     
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Enter number");
            BigInteger number = BigInteger.Parse(Console.ReadLine());

            if(IsPrime(number))
            {
                Console.WriteLine("The number {0} is prime!", number);
            }
            else
            {
                Console.WriteLine("The number {0} is NOT prime!", number);
            }

        }
    }
}
