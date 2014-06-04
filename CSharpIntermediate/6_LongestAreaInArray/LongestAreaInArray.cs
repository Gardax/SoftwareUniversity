using System;
using System.Collections.Generic;

namespace _6_LongestAreaInArray
{
    class LongestAreaInArray
    {
        public static List<string> FindTheLongestSequance(IList<string> elements)
        {

            if (elements != null && elements.Count > 0)
            {
                int maxSequance = 1;
                int currentSequance = 1;
                string elementOfTheLongestSequance = elements[0];
                for (int i = 1; i <elements.Count; i++)
                {
                    
                    if (elements[i] == elements[i - 1])
                    {
                        currentSequance++;
                    }
                    else
                    {
                        if (maxSequance < currentSequance)
                        {
                            elementOfTheLongestSequance = elements[i - 1];
                            maxSequance = currentSequance;
                        }
                        currentSequance = 1;
                    }
                    
                }
                if (maxSequance < currentSequance)
                {
                    elementOfTheLongestSequance = elements[elements.Count-1];
                    maxSequance = currentSequance;
                }

                List<string> sequance = new List<string>();
                for (int i = 0; i < maxSequance; i++)
                {
                    sequance.Add(elementOfTheLongestSequance);
                }
                return sequance;
            }
            else
            {
                throw new ArgumentNullException("The collection is empty or not initialized!");
            }
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<string> elements=new List<string>();

            for (int i = 0; i < n; i++)
            {
                elements.Add(Console.ReadLine());
            }

            List<string> longestSequance = FindTheLongestSequance(elements);

            Console.WriteLine(longestSequance.Count);
            foreach (var element in longestSequance)
            {
                Console.WriteLine(element);
            }
        }
    }
}
