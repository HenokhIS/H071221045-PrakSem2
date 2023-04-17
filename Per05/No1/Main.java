package No1;
import java.util.Scanner;


// Contoh penggunaan program
public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Menghitung volume dan luas permukaan kubus
        runApp();
    }

    private static void runApp() {
        showBangunRuang();
        showBangunDatar();
        System.out.print("> ");
        String input = sc.nextLine();
        int isi;
        double data;

        switch (input) {
            case "1":
                Kubus kubus = new Kubus();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Volume");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Sisi : ");
                    data = sc.nextDouble();
                    kubus.setSisi(data);
                    System.out.printf("Hasil : %.2f cm^2",kubus.hitungLuas());
                }else{
                    System.out.print("Masukan Sisi : ");
                    data = sc.nextDouble();
                    kubus.setSisi(data);
                    System.out.printf("Hasil : %.2f cm^3",kubus.hitungVolume());
                }
            case "2":
                Balok balok = new Balok();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Volume");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Panjang : ");
                    data = sc.nextDouble();
                    balok.setPanjang(data);
                    System.out.print("Masukan Lebar : ");
                    data = sc.nextDouble();
                    balok.setLebar(data);
                    System.out.print("Masukan Tinggi : ");
                    data = sc.nextDouble();
                    balok.setTinggi(data);
                    System.out.printf("Hasil : %.2f cm^2",balok.hitungLuas());
                }else{
                    System.out.print("Masukan Panjang : ");
                    data = sc.nextDouble();
                    balok.setPanjang(data);
                    System.out.print("Masukan Lebar : ");
                    data = sc.nextDouble();
                    balok.setLebar(data);
                    System.out.print("Masukan Tinggi : ");
                    data = sc.nextDouble();
                    balok.setTinggi(data);
                    System.out.printf("Hasil : %.2f cm^2",balok.hitungVolume());
                }
            case "3":
                Bola bola = new Bola();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Volume");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    bola.setJari(data);
                    System.out.printf("Hasil : %.2f cm^2",bola.hitungLuas());
                }else{
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    bola.setJari(data);
                    System.out.printf("Hasil : %.2f cm^3",bola.hitungVolume());
                }
            case "4":
                Tabung tabung = new Tabung();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Volume");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    tabung.setJari(data);
                    System.out.print("Masukan Tinggi : ");
                    data = sc.nextDouble();
                    tabung.setTinggi(data);
                    System.out.printf("Hasil : %.2f cm^2",tabung.hitungLuas());
                }else{
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    tabung.setJari(data);
                    System.out.print("Masukan Tinggi : ");
                    data = sc.nextDouble();
                    tabung.setTinggi(data);
                    System.out.printf("Hasil : %.2f cm^3",tabung.hitungVolume());
                }
            case "5":
                Persegi persegi = new Persegi();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Keliling");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Sisi : ");
                    data = sc.nextDouble();
                    persegi.setSisi(data);
                    System.out.printf("Hasil : %.2f cm^2",persegi.hitungLuas());
                }else{
                    System.out.print("Masukan Sisi : ");
                    data = sc.nextDouble();
                    persegi.setSisi(data);
                    System.out.printf("Hasil : %.2f cm",persegi.hitungKeliling());
                }
            case "6":
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Keliling");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Panjang : ");
                    data = sc.nextDouble();
                    persegiPanjang.setPanjang(data);
                    System.out.print("Masukan Lebar : ");
                    data = sc.nextDouble();
                    persegiPanjang.setLebar(data);
                    System.out.printf("Hasil : %.2f cm^2",persegiPanjang.hitungLuas());
                }else{
                    System.out.print("Masukan Panjang : ");
                    data = sc.nextDouble();
                    persegiPanjang.setPanjang(data);
                    System.out.print("Masukan Lebar : ");
                    data = sc.nextDouble();
                    persegiPanjang.setLebar(data);
                    System.out.printf("Hasil : %.2f cm",persegiPanjang.hitungKeliling());
                }
            case "7":
                Lingkaran lingkaran = new Lingkaran();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Keliling");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    lingkaran.setJari(data);
                    System.out.printf("Hasil : %.2f cm^2",lingkaran.hitungLuas());
                }else{
                    System.out.print("Masukan Jari-jari : ");
                    data = sc.nextDouble();
                    lingkaran.setJari(data);
                    System.out.printf("Hasil : %.2f cm",lingkaran.hitungKeliling());
                }
            case "8":
                Segitiga segitiga = new Segitiga();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Keliling");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan Alas : ");
                    data = sc.nextDouble();
                    segitiga.setPanjang(data);
                    System.out.printf("Hasil : %.2f cm^2",segitiga.hitungLuas());
                }else{
                    System.out.print("Masukan Sisi : ");
                    data = sc.nextDouble();
                    segitiga.setPanjang(data);
                    System.out.printf("Hasil : %.2f cm",segitiga.hitungKeliling());
                }
            case "9":
                Trapesium trapesium = new Trapesium();
                System.out.println("1. Hitung Luas");
                System.out.println("2. Hitung Keliling");
                System.out.print("> ");
                isi = sc.nextInt();
                if(isi == 1){
                    System.out.print("Masukan a : ");
                    data = sc.nextDouble();
                    trapesium.setA(data);
                    System.out.print("Masukan b : ");
                    data = sc.nextDouble();
                    trapesium.setB(data);
                    System.out.print("Masukan Tinggi : ");
                    data = sc.nextDouble();
                    trapesium.setTinggi(data);
                    System.out.printf("Hasil : %.2f cm^2",trapesium.hitungLuas());
                }else{
                    System.out.print("Masukan a : ");
                    data = sc.nextDouble();
                    trapesium.setA(data);
                    System.out.print("Masukan b : ");
                    data = sc.nextDouble();
                    trapesium.setB(data);
                    System.out.print("Masukan c : ");
                    data = sc.nextDouble();
                    trapesium.setC(data);
                    System.out.print("Masukan d : ");
                    data = sc.nextDouble();
                    trapesium.setD(data);
                    System.out.printf("Hasil : %.2f cm",trapesium.hitungKeliling());
                }
            default:
                System.out.println("Input tidak valid!");
                runApp();
                break;
        }
    }

    // Class untuk menampilkan daftar bangun ruang
    public static void showBangunRuang() {
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
    }

    // Class untuk menampilkan daftar bangun datar
    public static void showBangunDatar() {
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
    }
}





