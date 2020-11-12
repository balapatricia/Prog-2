import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileTest {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        int sum = 0;
//        for (String item : args){
//            try{
//                sum += Integer.parseInt(item);
//            }catch (NumberFormatException e){
//                System.out.println(e.getMessage() + ": ezt én most kihagynám.");
//            }
//        }
//        System.out.println(sum);
//    }


    public static void main(String[] args) {

        File f = new File("proba.txt");

//        Formatter fmt = null;
//        try {
//            fmt = new Formatter(f);
//            fmt.format("Halihó!\n");
//            fmt.format("Földlakó!");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            if (fmt != null){
//                fmt.close();
//            }
//        }
//
//        File myfile = null;
//        if (args.length != 0){
//            myfile = new File(args[0]);
//        }
//        else {
//            myfile = f;
//        }
//
//        Scanner sc = null;
//        try {
//            sc = new Scanner(myfile);
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }finally {
//            if (sc != null){
//                sc.close();
//            }
//        }

//        try (Formatter fmt = new Formatter(f)){
//            for (int i = 0; i < 100; i++){
//                fmt.format(i + "\n");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try (Scanner sc = new Scanner(f)){
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)))){
            for (int i = 0; i < 100; i++){
                if (i%2 == 0){
                    bw.write(String.format("%d%n",i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String line;
            while ( (line = br.readLine()) != null){
                sum += Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }



}
