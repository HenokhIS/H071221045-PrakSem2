package No1;
import java.lang.Math;

// Class dasar untuk bangun ruang
abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuas();
}

// Class dasar untuk bangun datar
abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}

// Class turunan untuk kubus
class Kubus extends BangunRuang {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return getSisi() * getSisi() * getSisi();
    }
    
    public double hitungLuas() {
        return 6 * getSisi() * getSisi();
    }
}

// Class turunan untuk balok
class Balok extends BangunRuang {
    private double panjang,lebar,tinggi;
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return getPanjang() * getLebar() * getTinggi();
    }
    
    public double hitungLuas() {
        return 2 *((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
    }
}

// Class turunan untuk persegi
class Persegi extends BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return getSisi() * getSisi();
    }
    
    public double hitungKeliling() {
        return 4 * getSisi();
    }
}

// Class turunan untuk persegipanjang
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return getPanjang() * getLebar();
    }
    
    public double hitungKeliling() {
        return 2 * getPanjang() + 2 * getLebar();
    }
}

// Class turunan untuk lingkaran
class Lingkaran extends BangunDatar {
    private double jari;
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double hitungLuas() {
        return Math.PI * getJari() * getJari();
    }
    
    public double hitungKeliling() {
        return 2 * Math.PI * getJari();
    }
}

// Class turunan untuk bola
class Bola extends BangunRuang {
    private double jari;
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double hitungLuas() {
        return 4 * Math.PI * getJari() * getJari();
    }
    
    public double hitungVolume() {
        return 4 * Math.PI * (getJari() * getJari() * getJari()) / 3;
    }
}

// Class turunan untuk tabung
class Tabung extends BangunRuang {
    private double jari, tinggi;
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 2 * Math.PI * getJari() * (getJari() + getTinggi());
    }

    public double hitungVolume() {
        return Math.PI * getJari() * getTinggi();
    }
}

// Class turunan untuk segitiga
class Segitiga extends BangunDatar {
    private double a, b, c, panjang, tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double hitungLuas() {
        return (getPanjang() * getTinggi()) / 2;
    }

    public double hitungKeliling() {
        return getA() + getB() + getC();
    }
}

// Class turunan untuk trapesium
class Trapesium extends BangunDatar {
    private double a, b, c, d, tinggi;

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public double hitungLuas() {
        return ((getA() + getB()) * getTinggi()) / 2;
    }
    public double hitungKeliling() {
        return getA() + getB() + getC() + getD();
    }
}

