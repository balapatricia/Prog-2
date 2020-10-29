using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace zh.Gyakorlas
{
    class Mozi
    {

        static void Main(string[] args)
        {

            int n = Convert.ToInt32(Console.ReadLine());
            String[] data;
            List<Movie> l = new List<Movie>();

            for (int i = 0; i < n; i++)
            {
                data = Console.ReadLine().Split(';');
                l.Add(new Movie(data[0], Convert.ToInt32(data[1]), data[2], Convert.ToInt32(data[3]), Convert.ToInt32(data[4])));
            }
            l.Sort();
            foreach (Movie m in l)
            {
                Console.WriteLine(m);
            }

        }


    }

    class Movie : IComparable<Movie>
    {

        String title;

        int year;

        String director;

        int cost;

        int income;

        public Movie(string title, int year, string director, int cost, int income)
        {
            this.title = title;
            this.year = year;
            this.director = director;
            this.cost = cost;
            this.income = income;
        }

        public int CompareTo(Movie other)
        {
            int res = (other.income - other.cost).CompareTo(income - cost);
            if (res == 0)
            {
                res = year.CompareTo(other.year);
                if (res == 0)
                {
                    res = other.income.CompareTo(income);
                    if (res == 0)
                    {
                        res = title.CompareTo(other.title);
                    }
                }
            }
            return res;
        }

        public override string ToString()
        {
            return title;
        }
    }

}
