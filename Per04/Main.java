
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> listUser = new ArrayList<User>();
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
// memanggil method runApp
        runApp();
    }

    private static void runApp() {
        System.out.println("-".repeat(40));
        System.out.println("Selamat Datang di Aplikasi Login");
        System.out.println("-".repeat(40));
        System.out.println("1. Login");
        System.out.println("2. Buat Akun");
        System.out.println("3. Keluar");
        System.out.println("-".repeat(40));
        System.out.print("> ");

        String input = sc.nextLine();
        switch (input) {
            case "1":
                login();
                break;
            case "2":
                createNewUser();
                break;
            case "3":
                System.out.println("-".repeat(45));
                System.out.println("Terima kasih telah berkunjung!");
                System.out.println("-".repeat(45) + "\n");
                System.exit(0);
                break;
            default:
// opsi jika inputan salah atau tidak valid maka akan kembali memanggil method run app
                System.out.println("Input tidak valid!");
                runApp();
                break;
        }
    }

    private static void login() {
        System.out.println("-".repeat(40));
        System.out.println("Silakan Login");
        System.out.println("-".repeat(40));

// input username
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();

// input password
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = cekUser(username);

// kalau nilai user kosong, akan diminta untuk menginput ulang
        if (user == null) {
            System.out.println("Username tidak ditemukan!");
            login();
        } else {
// Mengecek apakah password dari User yang login berdasarkan username
// sama dengan password yang diinput sebelumnya, kemudian simpan
// hasilnya di variabel isPasswordMatch


            boolean isPasswordMatch = user.getPassword().equals(password);
             //jika password cocok  maka user berhasil login
            if (isPasswordMatch) {
                System.out.println("-".repeat(40));
                System.out.println("Berhasil Login");
                System.out.println("-".repeat(40));

                // tampilkan showDetailUser
                showDetailUser(cekProfile(username));
                runApp();
            } else {

                // kalau password tdk memenuhi syarat, minta input ulang dengan method login
                System.out.println("-".repeat(40));
                System.out.println("Password salah!");
                System.out.println("-".repeat(40));
                login();
            }
        }
    }

    private static User cekUser(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static Profile cekProfile(String username) {
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        return null;
    }
        // method static untuk mengecek apakah nilai username dari objek user dari User sama dengan nilai username argumen method
        // jika memenuhi syarat maka objek user akan dikembalikan
        // jika tidak maka akan dikembalikan nilai null

// method untuk membuat user baru
    private static void createNewUser() {
        System.out.println("-".repeat(40));
        System.out.println("Buat Akun Baru:");
        System.out.println("-".repeat(40));

        System.out.println("Nama Lengkap");
        System.out.print("> ");

        String fullName = sc.nextLine();
        int age = cekint();

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
// validasi input username dan password
        while (true) {
            try {
                System.out.println("Username");
                System.out.print("> ");
                username = sc.nextLine();
                if (isUsernameExist(username)) {
                    System.out.println("Username sudah digunakan!");
                    username = "";
                    continue;
                }
                break;

            }
            catch (Exception e) {
                System.out.println("Username tidak boleh kosong!");
                continue;
            }
        }
        while (true) {
            try {
                System.out.println("Password");
                System.out.print("> ");
                password = sc.nextLine();
                if (password.length() < 8) {
                    System.out.println("Password minimal 8 karakter!");
                    continue;
                }
                break;

            }
            catch (Exception e) {
                System.out.println("Password tidak boleh kosong!");
                continue;
            }
        }
// instance objek
        User user = new User(); 
        user.setUserName(username);
        user.setPassword(password);

        Profile profile = new Profile(fullName, age, hobby);
        profile.setUser(user);
// menambahkan profile yang dibuat ke listUserprofile
        listUserProfile.add(profile);
// menambahkan user yang dibuat ke listUser
        listUser.add(user);
        System.out.println("-".repeat(40));
        System.out.println("Akun Berhasil Dibuat!");
        System.out.println("-".repeat(40));

// Tampilkan semua data profile user yang login

        showDetailUser(profile);
        runApp();
        
    }
// method untuk cek akun baru sudah ada namanya atau belum
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }
// method untuk tampilkan detail user
    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(40));
        System.out.println(" ".repeat(12) +"--- Detail User ---");
        System.out.println();
        System.out.println("Nama Lengkap   : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Usia           : " + profile.getAge());
        System.out.println("Hobby          : " + profile.getHobby());
        System.out.println("Username       : " + profile.getUser().getUserName());
        System.out.println("-".repeat(40));
    }
// method untuk cek umur yang diinput angka atau bukan
    private static int cekint() {
        int result;
        while (true) {
            try {
                System.out.println("Umur");
                System.out.print("> ");
                result = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Input angka!");
                System.out.print("> ");
                continue;
            }
        }
        return result;
    }
}