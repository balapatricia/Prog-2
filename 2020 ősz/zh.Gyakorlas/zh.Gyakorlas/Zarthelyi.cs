using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace zh.Gyakorlas
{
    class Zarthelyi
    {
        static void Main(string[] args)
        {
            IDictionary<string, ISet<int>> dict = new SortedDictionary<string, ISet<int>>();

            string row = Console.ReadLine();
            while (row != null)
            {
                string[] datas = row.Split(';');
                ISet<int> value;
                bool init = dict.TryGetValue(datas[0], out value);
                if (init == false)
                {
                    value = new SortedSet<int>();
                    dict[datas[0]] = value;
                }
                if (datas[2] == "PASS")
                {
                    value.Add(int.Parse(datas[1]));
                }
                row = Console.ReadLine();
            }

            foreach (var item in dict)
            {
                if (item.Value.Count > 0)
                {
                    Console.WriteLine(item.Key + ": " + String.Join(", ", item.Value));
                }
                else
                {
                    Console.WriteLine(item.Key + ": NOTHING");
                }
            }
        }
    }
}
