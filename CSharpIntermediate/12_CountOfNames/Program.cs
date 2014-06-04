using System;
using System.Collections.Generic;
using System.Linq;

namespace _12_CountOfNames
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] names = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
            Dictionary<string, int> dictionary = new Dictionary<string, int>();

            foreach (var name in names)
            {
                int count = 0;
                if (dictionary.ContainsKey(name))
                {
                    count = dictionary[name];
                }
                dictionary[name] = count + 1;
            }

            foreach (KeyValuePair<string, int> item in dictionary.OrderBy(key => key.ToString()))
            {
                Console.WriteLine("{0} -> {1} times", item.Key, item.Value);
            }
        }
    }
}
