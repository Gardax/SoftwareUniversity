using System;
using System.Collections.Generic;
using System.Linq;

namespace _10_JoinLists
{
    class JoinLists
    {
        static void Main(string[] args)
        {
            var firstListNumbers = Console.ReadLine().Split(new char[] { ' ' },
                StringSplitOptions.RemoveEmptyEntries);
            var secondListNumbers = Console.ReadLine().Split(new char[] { ' ' },
                StringSplitOptions.RemoveEmptyEntries);

            List<int> firstNumbers=new List<int>();
            foreach (var number in firstListNumbers)
            {
                firstNumbers.Add(int.Parse(number));
            }

            List<int> secondNumbers = new List<int>();
            foreach (var number in secondListNumbers)
            {
                firstNumbers.Add(int.Parse(number));
            }

            List<int> joinedList = firstNumbers.Concat(secondNumbers).Distinct().ToList();
            joinedList.Sort();

            foreach (var number in joinedList)
            {
                Console.Write(number+" ");
            }
            Console.WriteLine();
        }
    }
}
