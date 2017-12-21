import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String args[]){
        Item1 item1 = new Item1(1,2);
        System.out.println(item1.toString());
        System.out.println("Hello World!");
        HashCode hashCode1 = new HashCode("ad", "ad");
        HashCode hashCode2 = new HashCode("ad", "ad");
        Map<HashCode, Integer> map = new HashMap<>();
        map.put(hashCode1, 1);
        map.put(hashCode2, 2);
        System.out.println("Hello");
    }
}
