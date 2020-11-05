using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace zh.Gyakorlas
{
    class Zaszlok
    {
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            IDictionary<string, List<string>> dict = new SortedDictionary<string, List<string>>();

            string[] data1;
            string[] data2;

            for (int i = 0; i < n; i++)
            {
                data1 = Console.ReadLine().Split(':');
                data2 = data1[1].Split(',');
                foreach (string item in data2)
                {
                    if (dict.ContainsKey(item))
                    {
                        dict[item].Add(data1[0]);
                    }
                    else
                    {
                        List<string> l = new List<string>();
                        l.Add(data1[0]);
                        dict[item] = l;
                    }
                }
            }

            string line;
            while ((line = Console.ReadLine()) != null)
            {
                if (dict.ContainsKey(line))
                {
                    dict[line].Sort();
                    Console.WriteLine(line + ":" + String.Join(",",dict[line]));
                }
                else
                {
                    Console.WriteLine(line);
                }
            }
        }
        

       
    }
}
