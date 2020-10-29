import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multikulti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        String[] data;
        while (sc.hasNextLine()){
            data = sc.nextLine().split(" ");
            if (data.length == 2){
                String value = map.get(data[0]);
                if (value == null || value.length() > data[1].length()){
                    map.put(data[0],data[1]);
                }
            }
            else {
                String value = map.get(data[0]);
                if (value == null){
                    value = "unknown";
                }
                System.out.println(value);
            }
        }
    }
}
