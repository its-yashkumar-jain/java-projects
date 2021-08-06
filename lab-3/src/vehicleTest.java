class Vehicle {
    String name, regNum, lastService;
    int price, wheels, engineCapacity;
    double weight;
}

class LMV extends Vehicle {
    int seatCapacity;
    String color;
}

class HMV extends Vehicle {
    double weightCapacity, loading;
}

class twoWheeler extends LMV {
    int gears;
}

class fourWheeler extends LMV {
    int powerSteering;
}

class truck extends HMV {
    int container;
}

public class vehicleTest {
    public static void main(String[] args) {
        System.out.println("Testing data");
        Vehicle v = new Vehicle();
        LMV lmv = new LMV();
        twoWheeler w2 = new twoWheeler();
        fourWheeler w4 = new fourWheeler();
        truck t = new truck();
    }
}
