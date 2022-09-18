// Write a program to store elements in Hashset and search a 
//particular element in it.

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeSet<Integer> set = new TreeSet<>();
        int value;
        System.out.println("enter values: ");
        for (int i = 0; i < 5; i++) {
            value = input.nextInt();
            set.add(value);
        }

        // System.out.println("enter key: ");
        // int key = input.nextInt();
        // System.out.println(set.contains(key));

        // for (int i : set) {
        // System.out.println(i);
        // }

        System.out.println(set.first());
        System.out.println(set.tailSet(3));
    }
}
