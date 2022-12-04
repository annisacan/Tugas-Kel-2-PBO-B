import java.util.ArrayList;
import java.util.HashSet;


public class hashset{
    public static void main(String[] args){     
        ArrayList<Integer> data_array = new ArrayList<>();
        ArrayList<String> data_array2 = new ArrayList<>();
        HashSet<Integer> data_hashSet = new HashSet<>();
        HashSet<String> data_hashSet2 = new HashSet<>();
        //Memasukan Nilai Default
        //< ArrayList > dengan urutan  1 3 2 5 4
        data_array.add(1);
        data_array.add(3);
        data_array.add(2);
        data_array.add(5);
        data_array.add(4);
        data_array2.add("Budi");
        data_array2.add("anton");

        //< HashSet > dengan urutan  1 3 2 5 4
        data_hashSet.add(1);
        data_hashSet.add(3);
        data_hashSet.add(2);
        data_hashSet.add(5);
        data_hashSet.add(4);
        data_hashSet2.add("Budi");
        data_hashSet2.add("Anton");
        
        
        //Memasukan Nilai Duplukat/Yang Sama Dengan Nilai Sebelumnya
         //< ArrayList >
        data_array.add(5);
        data_array.add(4);
        data_array.add(3);
        data_array2.add("Budi");
        data_array2.add("anton");

         //< HashSet >
        data_hashSet.add(5);
        data_hashSet.add(4);
        data_hashSet.add(3);
        data_hashSet2.add("Budi");
        data_hashSet2.add("Anton");
        
        //Menampilkan Daftar Nilai
        System.out.println("Array List :");
        System.out.println("Data Array data_array :" + data_array);
        System.out.println("Data Array data_array :" + data_array2);
        System.out.println("\nHashSet :");
        System.out.println("Data Array data_HashSet :" + data_hashSet);
        System.out.println("Data Array data_HashSet :" + data_hashSet2);
        System.out.println(" ");

        //method menghapus di HashSet menggunakan method Remove()

        data_hashSet.remove(4);
        data_hashSet.remove(3);

        System.out.println("data HashSet sesudah remove : "+ data_hashSet);
        System.out.println(" ");

        // Menghapus semua data pada Hash set
        data_hashSet.clear();
        data_hashSet2.clear();
        System.out.println("Menghapus semua data :");
        System.out.println("Data Array data_HashSet :" + data_hashSet);
        System.out.println("Data Array data_HashSet :" + data_hashSet2);




    }


}