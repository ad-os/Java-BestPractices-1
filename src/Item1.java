import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Item1 {

    private int x;
    private int y;
    Boolean b;
    private String g;
    private String h;
    private static SubClass innerClass = new SubClass();
    private Map<String, String > map = new HashMap<>();
    Collections collections;
    String m;

    public Item1() {

    }

    public Item1(int x, int y) {
        this.x  = x;
        this.y = y;
    }

    public Item1(String g, int x) {
        this.g = g;
        this.x = x;
    }

    public Item1(int x, String h) {
        this.x = x;
        this.h = h;
    }

    public static void intThenString(int x, String g) {

    }

    public static Item1 stringThenInt(String g, int x) {
        return new Item1(g, x);
    }

    public static Item1 returnInnerClass() {
        return innerClass;
    }

    @Override
    public String toString() {
        return this.x + "-" + this.y;
    }

    public void compareString() {
        String x = "Adhyan";
        x = "ad";
        System.out.println();
    }

    private static class SubClass extends Item1 {

        @Override
        public void compareString() {
            super.compareString();
        }
    }
}
