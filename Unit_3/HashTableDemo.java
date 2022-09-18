import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> t1 = new Hashtable<>();

        double bal;
        t1.put("zara", 22.3);
        t1.put("ha", 2.31);
        t1.put("hey", 22.1);
        System.out.println(t1);
        bal = t1.get(22.1);
        t1.put("zara", bal + 1000);
        System.out.println(t1);
    }
}
