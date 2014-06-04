using System;
using System.Numerics;

namespace _1_FibonacciNumbers
{
    class FibonacciNumbers
    {
        public static BigInteger Fib(int n)
        {
            BigInteger firstNumber = 0;
            BigInteger secondNumber = 1;
            BigInteger thirdNumber=1;

            if (n == 1) return firstNumber;
            if (n == 2) return secondNumber;
            for (int i = 1; i <= n; i++)
            {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
            return thirdNumber;
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(Fib(n));

        }
    }
}
