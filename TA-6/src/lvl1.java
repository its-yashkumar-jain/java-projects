abstract class Fruit {
    protected double rate, numOfGlass;

    abstract void getRate();

    abstract void produceJuice();

    double costOfJuice() {
        return this.numOfGlass * this.rate;
    }
}

class Apple extends Fruit {
    Apple(int numOfGlass) {
        this.numOfGlass = numOfGlass;
    }

    @Override
    void getRate() {
        this.rate = 25;
    }

    void produceJuice() {
        this.getRate();
        System.out.println("\nYour Apple juice is ready!\nPrice: " + this.costOfJuice());
    }
}

class Banana extends Fruit {
    Banana(int numOfGlass) {
        this.numOfGlass = numOfGlass;
    }

    @Override
    void getRate() {
        this.rate = 15;
    }

    void produceJuice() {
        this.getRate();
        System.out.println("\nYour Banana juice is ready!\nPrice: " + this.costOfJuice());
        System.out.println("Enjoy this atrocity!!");
    }
}

class Orange extends Fruit {
    Orange(int numOfGlass) {
        this.numOfGlass = numOfGlass;
    }

    @Override
    void getRate() {
        this.rate = 20;
    }

    void produceJuice() {
        this.getRate();
        System.out.println("\nYour Orange juice is ready!\nPrice: " + this.costOfJuice());
    }
}

class FruitFactory {
    public static Fruit produceFruit(String s, int numOfGlass) {

        if (s.toLowerCase().equals("apple")) {
            return new Apple(numOfGlass);
        } else if (s.toLowerCase().equals("banana")) {
            return new Banana(numOfGlass);
        } else if (s.toLowerCase().equals("orange")) {
            return new Orange(numOfGlass);
        }
        return null;
    }
}

public class lvl1 {
    public static void main(String[] args) throws Exception {
        Fruit f = FruitFactory.produceFruit("apple", 6);
        f.produceJuice();

        Fruit f1 = FruitFactory.produceFruit("banana", 3);
        f1.produceJuice();

        Fruit f2 = FruitFactory.produceFruit("orange", 4);
        f2.produceJuice();
    }
}
