import java.util.Scanner;

public class no5 {
    public static void Tanggal(String t) {
        String[] bagi = t.split("-"); // split tanggal dd-mm-yy menjadi dd, mm, yy

        int day = Integer.parseInt(bagi[0]); // ubah ke int dan masukkan ke array
        int month = Integer.parseInt(bagi[1]); // ubah ke int dan masukkan ke array
        int year = Integer.parseInt(bagi[2]); // ubah ke int dan masukkan ke array

        // switch case untuk mengecek bulan 1 hingga 12
        String bulan;
        switch (month) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                bulan = "Invalid month";
                break;
        }

        // agar tahun tertulis menjadi 20XX atau 19XX
        if(year <= 23) {
            year = year + 2000;
        } else {
            year = year + 1900;
        }
        // format tanggal jadi Hari Bulan Tahun
        String formattedDate = String.format("%d %s %d", day, bulan, year);

        System.out.println(formattedDate);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        Tanggal(userInput); // panggil method dari atas

        input.close();
    }
}
