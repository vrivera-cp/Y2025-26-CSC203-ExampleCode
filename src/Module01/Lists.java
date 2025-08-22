package Module01;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A hello program exemplifying List usage.
 * @author Vanessa Rivera
 * @version 1.0
 */
public class Lists {
    /**
     * The main method that is the program's entry point when executed.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Array List Usage
        ArrayList<Integer> al;
        al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(al.get(2)); // 3

        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(a); // [1, 2, 3]

        // Linked List Usage
        LinkedList<Integer> ll;
        ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        LinkedList<Integer> b = new LinkedList<>(List.of(1, 2, 3));
        System.out.println(ll.get(2)); // 3


        // List Type Polymorphism
        List<Character> c = new ArrayList<>();
        c.add('c');
        System.out.println(c); // [c]
        
        List<String> d = new LinkedList<>();
        d.add("d");
        System.out.println(d); // [d]
    }
}