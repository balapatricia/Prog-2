import java.util.*;

public class Hullamvasutak{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Hullamvasut> l = new ArrayList<>();
        String[] data;
        for (int i = 0; i < n; i++){
            data = sc.nextLine().split(";");
            l.add(new Hullamvasut(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
        }
        Collections.sort(l);
        for (Hullamvasut h:l) {
            System.out.println(h);
        }
        System.out.println();
        Collections.sort(l, new Hullamvasut.Order());
        for (Hullamvasut h:l) {
            System.out.println(h);
        }

    }

}

class Hullamvasut implements Comparable<Hullamvasut>{

    String name;

    String worldName;

    int cm;

    int wait;

    public Hullamvasut(String name, String worldName, int cm, int wait) {
        this.name = name;
        this.worldName = worldName;
        this.cm = cm;
        this.wait = wait;
    }

    @Override
    public String toString() {
        return name + " (" + worldName + "): " + wait;
    }


    @Override
    public int compareTo(Hullamvasut o) {
        int res = Integer.compare(wait,o.wait);
        if (res == 0){
            res = Integer.compare(o.cm,cm);
            if (res == 0){
                res = name.compareTo(o.name);
            }
        }
        return res;
    }

    static class Order implements Comparator<Hullamvasut>{

        @Override
        public int compare(Hullamvasut o1, Hullamvasut o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}