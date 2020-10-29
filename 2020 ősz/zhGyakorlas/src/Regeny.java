import java.util.*;

public class Regeny {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String,List<String>> map = new TreeMap<>();

        String[] data;
        String[] data1;
        String[] data2;
        while (sc.hasNextLine()){
            data = sc.nextLine().split(":");
            data1 = data[0].split(";");
            data2 = data[1].split(",");
            for (String i : data2){
                List<String> value = map.get(i);
                if (value == null){
                    value = new ArrayList<>();
                    map.put(i,value);
                }
                if (!value.contains(data1[0])){
                    value.add(data1[0]);
                }
            }
        }

        for (Map.Entry<String,List<String>> entry : map.entrySet()){
            if (entry.getValue().size() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue().size());
            }
        }

    }
}
