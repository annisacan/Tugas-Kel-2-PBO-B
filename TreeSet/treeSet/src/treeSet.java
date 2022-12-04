import java.util.*;
/**
 * treeSet
 */
public class treeSet {
    public static void main(String[] args) {
        /* Creating a Set interface with
        reference to TreeSet class
        Deklarasi objek bertipe String */ 
        TreeSet<String> ts = new TreeSet<>();
 
        // Element ditambahkan menggunakan method add()
        ts.add("SI");
        ts.add("Adalah");
        ts.add("Sistem Informasi");
 
        // Print semua element pada object
        System.out.println(ts);
        String check = "Sistem Informasi";
 
        // Memperiksa apakah String check diatas ada pada TreeSet atau tidak
        System.out.println("Contains " + check + " " + ts.contains(check));
 
        // Print element pertama pada TreeSet
        System.out.println("First Value " + ts.first());
 
        // Print element terakhir pada TreeSet
        System.out.println("Last Value " + ts.last());
 
        String val = "SI";
 
        /* Mencari nilai apakah nilai lebih besar 
        atau lebih kecil dari String diatas*/
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
    }

    
}