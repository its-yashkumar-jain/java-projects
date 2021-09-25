import java.util.Random;

class OddCube extends Thread {

    int num;

    OddCube(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(num + "\'s cube is " + num * num * num);
    }

}

class EvenSquare extends Thread {

    int num;

    EvenSquare(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(num + "\'s Square is " + num * num);
    }

}

class Thread1 extends Thread {

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            if (num % 2 == 1) {
                OddCube n = new OddCube(num);
                n.start();
            } else {
                EvenSquare n = new EvenSquare(num);
                n.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Thread1 t = new Thread1();
        t.start();
    }
}
