import java.util.Scanner;

public class no2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //untuk membuat scanner
        
        try {
            int n = sc.nextInt(); //inputan sebagai berapa banyak yang ingin diinput nantinya
            Double[] arr = new Double[n]; 
            // membuka array dalam bentuk tipe data double agar bilangan bulat juga dapat masuk
            int i;

            for(i = 0 ; i < n ; i++) { 
                // membuat perulangan untuk input angka tergantung berapa banyak yang telah ditentukan diatas
                arr[i] = sc.nextDouble(); // input angka lalu dimasukkan ke array
            }

            int bulat = 0;
            int desimal = 0;

            for (double num : arr) { // perulangan untuk angka didalam array
                if (num == (int)num) { //jika angkanya itu bisa diubah ke bentuk integer, nilai bil bulat +1
                    bulat++;
                } else { //jika angkanya tidak dapat diubah ke bentuk integer, nilai bil desimal +1
                    desimal++;
                }
            }

            System.out.println("Terdapat "+bulat+" Bilangan Bulat");
            System.out.println("Terdapat "+desimal+" Bilangan Desimal");

        } catch(Exception e){
            System.out.println("Masukkan Angka!");
        }
        sc.close();
    }
}