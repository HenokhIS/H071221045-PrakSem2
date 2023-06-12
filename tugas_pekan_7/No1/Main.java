package No1;
abstract class Character {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void printAttack(Character character) {
        int power = character.attack();
        System.out.println("Attack Power: " + power);
    }

    abstract int attack();
    abstract int attack(String attackType);
}

class Fighter extends Character {
    private int attackPower;

    public Fighter(int attackPower) {
        this.attackPower = attackPower;
    }

    public int attack() {
        return attackPower;
    }

    public int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    private int attackPower;

    public Mage(int attackPower) {
        this.attackPower = attackPower;
    }

    public int attack() {
        return attackPower;
    }

    public int attack(String attackType) {
        if (attackType.equals("fire")) {
            return attackPower * 3;
        } else if (attackType.equals("frost")) {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter(10);
        characters[1] = new Mage(8);
        characters[2] = new Fighter(12);
        characters[3] = new Fighter(15);
        characters[4] = new Mage(10);

        for (Character character : characters) {
            character.printAttack(character);
        }

        System.out.println(characters[0].attack("ranged"));
        System.out.println(characters[1].attack("fire"));
        System.out.println(characters[2].attack("melee"));
        System.out.println(characters[3].attack("melee"));
        System.out.println(characters[4].attack("frost"));
    }
}

