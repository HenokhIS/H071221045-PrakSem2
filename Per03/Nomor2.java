class Player{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(int hp, String name, int attackPower, int defense) {
        this.hp = hp;
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player(String name, int attackPower, int defense){
        this(100, name, attackPower, defense);
    }

    public Player(String name, int attackPower){
        this(100, name, attackPower, 10);
    }

    public void getDamage(Player enemy) {
        hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }
    // Lengkapi
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
    }
public class Nomor2 {
    public static void main(String [] args) {

        Player player1= new Player("Mino", 30, 15);
        Player player2= new Player("Hilda", 10);

        player2.setAttackPower(35);

        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
}