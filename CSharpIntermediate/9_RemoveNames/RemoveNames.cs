using System;
using System.Linq;

namespace _9_RemoveNames
{
    class RemoveNames
    {
        static void Main(string[] args)
        {
            var names = Console.ReadLine().Split(new char[] {' '},
                StringSplitOptions.RemoveEmptyEntries);
            var namesToRemove = Console.ReadLine().Split(new char[] { ' ' }, 
                StringSplitOptions.RemoveEmptyEntries);

            var namesToDisplay = names.Where(n => !namesToRemove.Contains(n));
            foreach (var name in namesToDisplay)
            {
                Console.Write(name+" ");
            }
            Console.WriteLine();
        }
    }
}
