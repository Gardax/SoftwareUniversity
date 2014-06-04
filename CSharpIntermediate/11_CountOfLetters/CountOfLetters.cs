using System;
using System.Collections.Generic;
using System.Linq;

namespace _11_CountOfLetters
{
    class CountOfLetters
    {
        static void Main(string[] args)
        {

            string[] letters = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries);
            Dictionary<string, int> dictionary = new Dictionary<string, int>();

            foreach (var letter in letters)
            {
                int count = 0;
                if (dictionary.ContainsKey(letter))
                {
                    count = dictionary[letter];
                }
                dictionary[letter] = count + 1;
            }

            foreach (KeyValuePair<string, int> item in dictionary.OrderBy(key => key.ToString()))
            {
                Console.WriteLine("{0} -> {1} times", item.Key, item.Value);
            }
        }
    }
}
