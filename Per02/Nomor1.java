class Games {
    String NamaOrang, NamaGame, Jenis, OnOff;
    int Release, TotalJam;
    boolean Internet;

    void halo() {
        System.out.printf("Nama saya %s, game favorit saya %s yaitu sejenis game %s %s yang keluar pada tahun %d dan saya telah bermain sebanyak %d jam. ", NamaOrang, NamaGame, Jenis, OnOff, Release, TotalJam);
    }

    void getInternet() {
        if (Internet == true) {
            OnOff = "Online";
        } else {
            OnOff = "Offline";
        }
    }
}

public class Nomor1 {
    public static void main(String[] args) {
        Games orang1 = new Games();

        orang1.NamaOrang = "Henokh";
        orang1.NamaGame = "CSGO";
        orang1.Jenis = "FPS";
        orang1.Internet = true;
        orang1.Release = 2012;
        orang1.TotalJam = 200;

        orang1.getInternet();
        orang1.halo();
    }
}
