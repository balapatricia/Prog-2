using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fajl
{
    class Program
    {
        //static void Main(string[] args)
        //{
        //    Console.WriteLine(args.Length);
        //    int sum = 0;
        //    foreach (string item in args)
        //    {
        //        try
        //        {
        //            sum += Convert.ToInt32(item);
        //        }catch(FormatException e)
        //        {
        //            Console.WriteLine(e.Message);
        //        }

        //    }
        //    Console.WriteLine(sum);
        //}

        static void Main(string[] args)
        {

            StreamWriter sw = null;

            try
            {
                sw = new StreamWriter("szamok.txt");
                for (int i = 0; i < 100; i++)
                {
                    if (i % 2 == 0)
                    {
                        sw.WriteLine(i);
                    }
                }
            }catch (FileNotFoundException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                if (sw != null)
                {
                    sw.Close();
                }
            }

            int sum = 0;

            StreamReader sr = null;
            try
            {
                sr = new StreamReader("szamok.txt");
                while (!sr.EndOfStream)
                {
                    sum += Convert.ToInt32(sr.ReadLine());
                }
            }catch (FileNotFoundException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                if (sr != null)
                {
                    sr.Close();
                }
            }
            Console.WriteLine(sum);

            //StreamWriter sw = null;
            //try
            //{
            //    sw = new StreamWriter("data.txt");
            //    sw.WriteLine("Halihó!");
            //    sw.WriteLine("Földlakó!");
            //}catch (FileNotFoundException e)
            //{
            //    Console.WriteLine(e.Message);
            //}
            //finally
            //{
            //    if (sw != null)
            //    {
            //        sw.Close();
            //    }
            //}



            //StreamReader sr = null;
            //try
            //{
            //    if (args.Length != 0){
            //        sr = new StreamReader(args[0]);
            //    }
            //    else
            //    {
            //        sr = new StreamReader("data.txt");
            //    }

            //    string line;
            //    while ( (line = sr.ReadLine()) != null)
            //    {
            //        Console.WriteLine(line);
            //    }
            //}catch (FileNotFoundException e)
            //{
            //    Console.WriteLine(e.Message);
            //}
            //finally
            //{
            //    if (sr != null)
            //    {
            //        sr.Close();
            //    }
            //}
            //Console.WriteLine("itt vagyok halihó!");

            //try
            //{
            //    using (StreamReader srr = new StreamReader("data.txt"))
            //    {
            //        string line;
            //        while ((line = srr.ReadLine()) != null)
            //        {
            //            Console.WriteLine(line);
            //        }
            //    }
            //}catch (FileNotFoundException e)
            //{
            //    Console.WriteLine(e.Message);
            //}
        }
    } 

        






















        //static void Main(string[] args)
        //{

        //    string str = "alma alma alma";
        //    int db = ExtensionClass.WordCount(str);
        //    Console.WriteLine(db);
        //    db = str.WordCount();
        //    Console.WriteLine(db);
        //}
    //}

    //static class ExtensionClass
    //{
    //    public static int WordCount(this string str)
    //    {
    //        return str.Split(' ').Length;
    //    }
    //}
}
