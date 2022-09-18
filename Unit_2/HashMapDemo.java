import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();

        System.out.println("Enter Values: ");
        String key;
        int value;
        for (int i = 0; i < 2; i++) {
            key = input.next();
            value = input.nextInt();

            map.put(key, value);
        }

        // System.out.println("Enter Values2: ");
        // String key1;
        // int value1;
        // for (int i = 0; i < 2; i++) {
        // key1 = input.next();
        // value1 = input.nextInt();

        // map1.put(key1, value1);
        // }

        // System.out.println(map1.equals(map));
        // map.put("ABc", 3);
        // System.out.println("Contains key: " + map.containsKey("AB"));
        // System.out.println("Contains value: " + map.containsValue(3));
        // map.clear();

        // System.out.println(map.entrySet());
        // System.out.println(map);

        // for (Map.Entry m : map.entrySet()) {
        // System.out.println(m.getKey() + " = " + m.getValue());
        // }a
        // System.out.println(map.get("a"));

        // System.out.println(map.hashCode()); hasCode
        // System.out.println(map.isEmpty()); // isEmpty

        // System.out.println(map.keySet());

        // map.remove("a");
        // System.out.println(map);
        System.out.println(map.values());

    }
}
