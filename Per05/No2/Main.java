package No2;

class Anggota {
    protected String nama;
    protected int umur;
    
    public Anggota(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void detailAnggota() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
    }
}

class PengurusInti extends Anggota {
    private String peran;

    public PengurusInti(String nama, int umur, String peran) {
        super(nama, umur);
        this.peran = peran;
    }

    public void detailPengurusInti() {
        super.detailAnggota();
        System.out.println("Peran: " + peran);
    }
}

class KoordinatorBidangStaf extends Anggota {
    private String divisi;

    public KoordinatorBidangStaf(String nama, int umur, String divisi) {
        super(nama, umur);
        this.divisi = divisi;
    }

    public void detailKoordinatorBidangStaf() {
        super.detailAnggota();
        System.out.println("Divisi: " + divisi);
    }
}

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Angga", 25);
        anggota1.detailAnggota();

        PengurusInti pengurus1 = new PengurusInti("Budi", 30, "Keuangan");
        pengurus1.detailPengurusInti();

        KoordinatorBidangStaf koordinator1 = new KoordinatorBidangStaf("Citra", 27, "Pendidikan");
        koordinator1.detailKoordinatorBidangStaf();
    }
 }