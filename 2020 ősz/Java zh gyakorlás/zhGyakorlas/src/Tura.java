import java.util.*;

public class Tura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Turazo>> map = new TreeMap<>();
        String[] data1;
        String[] data2;
        String line;

        while(sc.hasNextLine()){

            data1 = sc.nextLine().split(";");
            for (int i = 1; i < data1.length; i++) {
                data2 = data1[i].split(":");
                ArrayList<Turazo> value = map.get(data2[0]);
                if(value == null){
                    value = new ArrayList<Turazo>();
                    map.put(data2[0],value);
                }
                value.add(new Turazo(data1[0],Integer.parseInt(data2[1])));
            }

        }
        for(Map.Entry<String, ArrayList<Turazo>> entry : map.entrySet()){
            StringJoiner sj = new StringJoiner(", ");
            Collections.sort(entry.getValue());
            for (Turazo item:entry.getValue()) {
                sj.add(item.toString());
            }

            System.out.println(entry.getKey()+ " (" + entry.getValue().size()+ "): "+ sj.toString());
        }

    }
}

class Turazo implements Comparable<Turazo>{

    String nev;
    int km;

    public Turazo(String nev, int km) {
        this.nev = nev;
        this.km = km;
    }

    @Override
    public String toString() {
        return nev;
    }

    @Override
    public int compareTo(Turazo o) {

        int res = Integer.compare(o.km,this.km);
        if(res ==0){
            res = nev.compareTo(o.nev);
        }
        return res;
    }
}
