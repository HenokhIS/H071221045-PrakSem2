package No3;

import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 25000;

    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 80000;

    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 100000;

    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        switch (type.toLowerCase()) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                throw new IllegalArgumentException("Invalid food type");
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> orders) {
        int total = 0;
        for (Food order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(burger);
        foods.add(steak);
        foods.add(burger);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        
        System.out.println("Total Harga : "+ total);
    }
}