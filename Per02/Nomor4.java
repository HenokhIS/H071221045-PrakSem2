class Cuboid {
    double height, weight, length, volume;

    double getVolume() {
        volume = height * weight * length;
        return volume;
    }
}

public class Nomor4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.height = 10;
        cuboid.weight = 12.2;
        cuboid.length = 15.4;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
