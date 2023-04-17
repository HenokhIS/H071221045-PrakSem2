import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Name: ");
            String name = sc.nextLine(); // input dalam bentuk string
        
            System.out.print("Umur: ");
            int age = sc.nextInt(); // input dalam bentuk integer
            sc.nextLine(); // next line
        
            System.out.print("Hobby: ");
            String hobby = sc.nextLine(); // input dalam bentuk string
    
            System.out.print("Nama saya "+ name + ", " + age + ", " + "hobby " + hobby);

        } catch(Exception e) { // menangkap error 
            System.out.println("Error");
        }

        sc.close();
    }
    
}
