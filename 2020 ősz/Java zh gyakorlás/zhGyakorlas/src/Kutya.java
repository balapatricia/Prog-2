import java.util.*;

public class Kutya  implements Comparable<Kutya>{

    String nev;
    String szin;

    public Kutya(String nev, String szin) {
        this.nev = nev;
        this.szin = szin;
    }


    @Override
    public int compareTo(Kutya o) {
        return nev.compareTo(o.nev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        List<Kutya> list = new ArrayList<>();
        String [] t;

        for(int i=0; i<n; i++){
            t=sc.nextLine().split(":");
            list.add(new Kutya(t[0],t[1]));
        }
        Collections.sort(list);
        int m=Integer.parseInt(sc.nextLine());
        for(int i=0; i<m; i++){
            t=sc.nextLine().split(":");
            System.out.printf(t[0]+":");
            StringJoiner sj = new StringJoiner(",");
            List<String> value = new ArrayList<>();
            for (Kutya k : list
            ) {
                if(k.szin.equals(t[1])){
                    value.add(k.nev);
                }
            }
            Collections.sort(value);
            for (String item : value
            ) {
                sj.add(item);
            }
            System.out.println(sj.toString());
        }

    }





}
