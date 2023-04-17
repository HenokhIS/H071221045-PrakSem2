class Produk {
    String id, nama;
    int stok, harga;   

    public void cekstok(){
        if(stok == 0){
            System.out.println("\nStok Tidak Tersedia");    
        }else{
            System.out.println("\nStok Tersedia");
        }
    }
    public void detail(){
    System.out.printf("ID Produk : %s\nNama Produk : %s\nStok : %d\nHarga : Rp.%d",id,nama,stok,harga);
    }
}

public class Nomor3 {
    public static void main(String[] args) {
        Produk produk1 = new Produk();

        produk1.id = "F001";
        produk1.stok = 0;
        produk1.nama = "Mie Sedaap";
        produk1.harga = 2000;
        produk1.detail();
        produk1.cekstok();

    }
}