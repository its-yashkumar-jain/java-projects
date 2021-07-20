class abc {
    int c = 4;
}

class parent extends abc {
    int a = 10, b = 4;
}

public class inheritence extends parent {
    void printNum() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        inheritence i = new inheritence();
        i.printNum();
    }
}
