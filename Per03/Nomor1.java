class HonkaiImpact {
  // Atribut
  String nama, type, rank;
  int damage;

    //Constructor
    public HonkaiImpact() {
    }
  
    public HonkaiImpact(String nama, String type, int damage, String rank) {
      this.nama = nama;
      this.type = type;
      this.damage = damage;
      this.rank = rank;
    }
  
  //Setter Getter
  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }
  
  //Behaviour

  public void tampilkanChara() {
    System.out.println("\n========== Character ==========");
    System.out.println("Nama          : " + this.getNama());
    System.out.println("Type          : " + this.getType());
    System.out.println("Damage        : " + this.getDamage());
    System.out.println("Rank          : " + this.getRank());
  }

  public void Fight(HonkaiImpact demeg) {
    if(this.getDamage() >= demeg.getDamage() && this.getType().equals("Api") && demeg.getType().equals("Es")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Menang dengan Damage %d Menggunakan Elemen %s dan Rank %s Mengalahkan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Api") && demeg.getType().equals("Es")) {
      System.out.println("=".repeat(31));
      System.out.printf("Terjadi Pertarungan Sengit Antara %s yang Damagenya %d Menggunakan Elemen %s dan Rank %s dengan %s yang Damagenya %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Es") && demeg.getType().equals("Api")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Kalah dengan Damage %d Menggunakan Elemen %s dan Rank %s Melawan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if(this.getDamage() >= demeg.getDamage() && this.getType().equals("Es") && demeg.getType().equals("Petir")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Menang dengan Damage %d Menggunakan Elemen %s dan Rank %s Mengalahkan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Es") && demeg.getType().equals("Petir")) {
      System.out.println("=".repeat(31));
      System.out.printf("Terjadi Pertarungan Sengit Antara %s yang Damagenya %d Menggunakan Elemen %s dan Rank %s dengan %s yang Damagenya %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Petir") && demeg.getType().equals("Es")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Kalah dengan Damage %d Menggunakan Elemen %s dan Rank %s Melawan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if(this.getDamage() >= demeg.getDamage() && this.getType().equals("Petir") && demeg.getType().equals("Api")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Menang dengan Damage %d Menggunakan Elemen %s dan Rank %s Mengalahkan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Petir") && demeg.getType().equals("Api")) {
      System.out.println("=".repeat(31));
      System.out.printf("Terjadi Pertarungan Sengit Antara %s yang Damagenya %d Menggunakan Elemen %s dan Rank %s dengan %s yang Damagenya %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    } else if (this.getDamage() <= demeg.getDamage() && this.getType().equals("Api") && demeg.getType().equals("Petir")) {
      System.out.println("=".repeat(31));
      System.out.printf("%s Kalah dengan Damage %d Menggunakan Elemen %s dan Rank %s Melawan %s dengan Damage %d Yang Menggunakan Elemen %s dan Rank %s%n", this.getNama(),this.getDamage(),this.getType(),this.getRank(),demeg.getNama(),demeg.getDamage(),demeg.getType(),demeg.getRank());
    }
  }
}
public class Nomor1 {
  public static void main(String[] args) {
    HonkaiImpact HI01 = new HonkaiImpact("Bronya", "Es", 5000, "S");
    HonkaiImpact HI02 = new HonkaiImpact("Kiana", "Api", 7000, "S");
    HonkaiImpact HI03 = new HonkaiImpact("Mei", "Petir", 6000, "S");

    HI01.tampilkanChara();
    HI02.tampilkanChara();
    HI03.tampilkanChara();

    HI01.Fight(HI02);
  }
}
