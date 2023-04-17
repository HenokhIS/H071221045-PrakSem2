import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // array 2d
            int angka = sc.nextInt(); // inputan user dan harus dalam bentuk integer
    
            // 2 perulangan for dilakukan karena array berbentuk 2d (i dan j)
            for (int i = 0; i < nums.length; i++) { 
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i][j] == angka) { // mengecek pada koordinat yang ditentukan apakah sesuai
                        System.out.println("Found " + angka + " at ["+i+"]["+j+"]"); // print hasil jika sesuai
                        break; // memberhentikan perulangan jika telah ditemukan
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Masukkan Angka!");
        }
    }
}
