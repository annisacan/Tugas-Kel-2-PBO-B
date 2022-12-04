import java.util.LinkedHashSet;

public class link_hashSet {
    public static void main(String[] args) {

        LinkedHashSet<String> menu = new LinkedHashSet<String>();
        menu.add("Mie Pedas");
        menu.add("Ayam Geprek");
        menu.add("Pempek");
        menu.add("Kebab");
        menu.add("Jasuke");
        menu.add("Lemon Tea");

        System.out.println("Menu Awal Expo\t\t\t:" + menu);
        System.out.println("Banyak menu\t\t\t:" + menu.size());
        System.out.println("Menghapus Lemon Tea dari menu\t:" + menu.remove("Lemon Tea"));
        System.out.println("Menghapus Green Tea dari menu\t:" + menu.remove("Green Tea"));
        System.out.println("Menu tanpa minuman\t\t:" + menu);
        System.out.println("Menambah menu Kebab kembali\t:" + menu.add("Kebab")); // kelebihan linkedlist tidak bisa
                                                                                  // duplikat data
        System.out.println("Melihat tersedianya Kebab di menu:" + menu.contains("Kebab"));
        System.out.println("Banyak menu akhir\t\t:" + menu.size());
        System.out.println("Menampilkan menu secara vertikal:");
        for (String strLHS : menu) {
            System.out.println(strLHS);
        }

    }
}
