import java.util.Scanner;

public class no4 {
    public static void BesarKecil(String s) {
        
        String[] judul = s.split(" "); 
        //inputan dlu dimasukkan dalam bentuk array lalu setiap kata di bagi setiap spasi
        StringBuilder formatString = new StringBuilder();

        for (String word : judul) {
            if (word.length() > 1) {
                formatString.append(word.substring(0, 1).toUpperCase());
                formatString.append(word.substring(1).toLowerCase());
            } else {
                formatString.append(word.toUpperCase());
            }
            formatString.append(" ");
        }
        System.out.println(formatString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Judul Film: ");
        String input = sc.nextLine(); // inputtan judul film dalam bentuk string

        sc.close();

        BesarKecil(input);
    }
}
