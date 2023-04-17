import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class Product {
    private String namaBarang;
    private int price, stock;

    public Product() {
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getPrice() {
        return price;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product (String namaBarang, int price, int stock) {
        this.namaBarang = namaBarang;
        this.stock = stock;
        this.price = price;
    }

    public Product (String namaBarang, String price, int stock) {
        this.namaBarang = namaBarang;
        this.stock = stock;
        this.price = Integer.parseInt(price.substring(0, price.length() - 1) + "000");
    }

    public void checkStock(Store store) {
        this.stock--;
        if (this.stock <= 0) {
            store.getProduct().remove(this);
        }
    }
}

class Store {
    private String namaToko;
    private ArrayList<Product> product;

    public Store() {
    }

    public String getNamaToko() {
        return namaToko;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public Store(String namaToko, ArrayList<Product> product) {
        this.namaToko = namaToko;
        this.product = product;
    }

    public void displayproduct() {
        int i = 1;
        System.out.printf("\nSelamat Datang di %s\nDaftar Produk:", this.namaToko);

        for (Product product : this.product) {
            System.out.printf("\n%d. %s - $%d | Stok %d", i, product.getNamaBarang(), product.getPrice(), product.getStock());
            i++;
        }

        System.out.println("\n0. Keluar");
    }

    public void addProduct(Product product) {
        this.product.add(product);
    }
}

public class Nomor3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        User user = new User("Me", 10000);

        ArrayList<Product> produk = new ArrayList<>();
        produk.add(new Product("HP Pavilion Gaming 15", 2000, 2));
        produk.add(new Product("Asus Vivobook 15 A516MAO N4020", 4000, 4));
        produk.add(new Product("ROG Zephyrus Duo", 10000, 9));
        
        Store KompCorp = new Store("Komputer Corp", produk);
        KompCorp.addProduct(new Product("MacBook Pro", "15k", 7));

        
        while (true) {
            System.out.println("-".repeat(18)+"CARD"+"-".repeat(18));
            System.out.println(user.getName());
            System.out.printf("$%d%n",user.getBalance());
            System.out.println("-".repeat(40));
            KompCorp.displayproduct();
            System.out.print("> ");
            int pilihan = input.nextInt();

            if(pilihan > KompCorp.getProduct().size()) {
                System.out.println("-".repeat(40));
                System.out.println("Not in option!!");

            } else if ( 1<= pilihan && pilihan <= produk.size()) {
                System.out.println("-".repeat(40)); // garis
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", KompCorp.getProduct().get(pilihan - 1).getNamaBarang(), KompCorp.getProduct().get(pilihan - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true) {
                    System.out.printf("1. Confirm%n2. Cancel%n");
                    System.out.print("> ");
                    int confirm = input.nextInt();

                    if (confirm == 1 && user.getBalance() >= KompCorp.getProduct().get(pilihan - 1).getPrice()) {
                        System.out.printf("%s successful buy out %s.%n", user.getName(), KompCorp.getProduct().get(pilihan - 1).getNamaBarang());
                        System.out.println("-".repeat(40));
                        System.out.printf("Information : Your Balance = $%d | Price list = $%d | Change = $%d%n", user.getBalance(), KompCorp.getProduct().get(pilihan - 1).getPrice(), user.getBalance() - KompCorp.getProduct().get(pilihan - 1).getPrice());
                        
                        user.setBalance(user.getBalance() - KompCorp.getProduct().get(pilihan - 1).getPrice());
                        KompCorp.getProduct().get(pilihan-1).checkStock(KompCorp);

                        System.out.println("-".repeat(40));
                        System.out.printf("Go to the next transaction%n1. Yes%n2. No%n");
                        System.out.print("> ");
                        int pilihan2 = input.nextInt();

                        if (pilihan2 == 1) {
                            break;

                        } else {
                            System.out.println("Thank You!!");
                            System.exit(0);
                        }

                    } else if (confirm == 2) {
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Information : Your Balance = $%d | Price list = $%d | %s%n", user.getBalance(), KompCorp.getProduct().get(pilihan - 1).getPrice(), (user.getBalance() < KompCorp.getProduct().get(pilihan - 1).getPrice()) ? "Insufficient Balance" : "Input correctly!!");
                        break;
                    }
                }

            } else {
                System.out.println("Thank You!!");
                break;
            }
        }

        input.close();
    }   
}