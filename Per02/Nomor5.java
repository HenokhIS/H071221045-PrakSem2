class Alamat{
    String jalan, kota;

    String getAlamatLengkap(){
        return jalan + ", " + kota;
    }
}
class Mahasiswa{
    String nama, nim;
    Alamat alamat;

    String getNama(){
        String Nama = nama;
        return Nama;
    }
    String getNim(){
        String NIM = nim;
        return NIM;
    }
    Alamat getAlamat(){
        return alamat;
    }
}

public class Nomor5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Veteran Selatan";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Henokh";
        mahasiswa.nim = "H071221045";

        System.out.println("Nama: "+mahasiswa.getNama());
        System.out.println("NIM: "+mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat().getAlamatLengkap()); 
    }
}
