import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        try{ // menggunakan try catch untuk mengecek jika ada salah input
            Scanner sc = new Scanner(System.in); // membuka scanner
            Double jari = sc.nextDouble(); // input dengan tipe data double

            sc.close();

            // melakukan perhitungan luas lingkaran dan langsung di print
            System.out.println(String.format("%.2f",(3.14 * jari * jari))); 
            
        } catch (Exception e) { // ketika yang di input tidak sesuai yang ditetapkan
            System.out.println("Masukkan angka!");
        }
    }
}
