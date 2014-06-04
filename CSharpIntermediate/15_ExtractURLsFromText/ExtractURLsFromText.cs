using System;
using System.Text.RegularExpressions;

namespace _15_ExtractURLsFromText
{
    class ExtractURLsFromText
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            MatchCollection urls = Regex.Matches(text, @"\b(?:http://|www\.)\S+\b");

            foreach (var url in urls)
            {
                Console.WriteLine(url);
            }
        }
    }
}
