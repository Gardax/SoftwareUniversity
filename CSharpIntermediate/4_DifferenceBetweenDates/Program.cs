using System;

namespace _4_DifferenceBetweenDates
{
    class Program
    {
        private static int CalculateDifferenceInDays(DateTime firstDate, DateTime secondDate)
        {
            TimeSpan difference = secondDate-firstDate;
            return int.Parse(difference.TotalDays.ToString());
        }

        static void Main(string[] args)
        {
            DateTime firstDate = DateTime.Parse(Console.ReadLine());
            DateTime secondDate = DateTime.Parse(Console.ReadLine());

            Console.WriteLine(CalculateDifferenceInDays(firstDate, secondDate));
        }
    }
}
