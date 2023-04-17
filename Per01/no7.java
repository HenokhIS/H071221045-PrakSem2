import java.util.Scanner;

public class no7 {
    public static int cari(String b) { // method yang nnti akan dipanggil
        String[] buah = {"apel", "pisang", "jeruk"};
        
        for (int i = 0; i < buah.length; i++) { // untuk mengecek apakah yang di input ada di dalam array atau tidak
            if (buah[i].equalsIgnoreCase(b)){ // mengecek dengan menghiraukan huruf besar kecil
                return i; // mengembalikan nilai i
            } 
        }
        return -1; // mengembalikan nilai -1 jika tidak sama

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newarray = sc.nextLine(); // user input dalam bentuk string

        System.out.println(cari(newarray)); // memanggil method diatas
        sc.close();
    }
}
