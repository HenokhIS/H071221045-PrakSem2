abstract class Dog {
    protected int position;
    protected int averageLength;

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getAverageLength() {
        return averageLength;
    }
    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
    abstract void move();
    abstract void describe(); 
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    void move() {
        System.out.println("Position: " + (position + 3));
    }
    void describe() {
        System.out.println("Pitbull adalah jenis anjing yang merupakan petarung");
    }
}

class Husky extends Dog {
    public Husky(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    void move() {
        System.out.println("Position: " + (position + 2));
    }
    void describe() {
        System.out.println("Siberian Husky adalah jenis anjing yang merupakan jinak");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    void move() {
        System.out.println("Position: " + (position + 1));
    }
    void describe() {
        System.out.println("Bulldog adalah jenis anjing yang merupakan berani");
    }
}

class Shepherd extends Dog {
    public Shepherd(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    void move() {
        System.out.println("Position: " + (position + 3));
    }
    void describe() {
        System.out.println("German Shepherd adalah jenis anjing yang merupakan berani");
    }
}

interface Moveable {
    void move();
}

class Smartphone implements Moveable {
    String brand;
    int price;
    
    public Smartphone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void move() {
        System.out.println("Smartphone Berpindah");
    }
}

class Car implements Moveable {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Mobil Sedang Berakselerasi");
    }
}

public class no1 {

    public static void main(String[] args) {
        Husky husky = new Husky(2, 40);
        System.out.printf("Panjang Husky adalah %dcm\n", husky.getAverageLength());
        husky.describe();
        husky.move();

        Smartphone smartphone = new Smartphone("Apple", 1999);
        smartphone.move();
        System.out.printf("Harga smartphone bermerek %s memiliki harga $%d", smartphone.brand, smartphone.price);

        Car car = new Car(4, "blue", 200);
        car.move();
        System.out.printf("Mobil ini memiliki %d gear maju\n", car.totalForwardGear);
        System.out.printf("Mobil ini berwarna %s\n", car.color);
        System.out.printf("Mobil ini memiliki kecepatan maksimum %dkm/jam\n", car.maxSpeed);
    }
}