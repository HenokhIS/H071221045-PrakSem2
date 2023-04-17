import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // membuka scanner agar bisa digunakan di baris bawah

        System.out.print("NIM = "); 
        String input = sc.nextLine(); // nextLine digunakan sebagai inputan berbentuk string
        String nim = input.substring(input.length() - 3); // substring lalu mengambil 3 angka paling belakang

        int newnim = 0; // membuka variabel baru utk integer
        newnim = Integer.parseInt(nim); // mengubah string menjadi integer

        if(newnim % 7 == 0) {
            System.out.println("Soal no.7");
        } else if(newnim % 7 == 1) {
            System.out.println("Soal no.1");
        } else if(newnim % 7 == 2) {
            System.out.println("Soal no.2");
        } else if(newnim % 7 == 3) {
            System.out.println("Soal no.3");
        } else if(newnim % 7 == 4) {
            System.out.println("Soal no.4");
        } else if(newnim % 7 == 5) {
            System.out.println("Soal no.5");
        } else {
            System.out.println("Soal no.6");
        // else if digunakan untuk menentukan soal yang didapat tergantung dari 3 angka dari nim terakhir
        } sc.close();
    }
}