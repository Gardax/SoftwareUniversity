using System;
using System.Linq;

namespace _14_LongestWordInText
{
    class LongestWordInText
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();

            string[] words = text.Split(new char[] {' ', '.', ',', '!', '"', }, StringSplitOptions.RemoveEmptyEntries);
            string longestWord=words.OrderByDescending(s => s.Length).First();
            Console.WriteLine(longestWord);

        }
    }
}
