class Human {
    String name, gender;

    Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    static public void find(Man m, Female f) {
        if (m.age == f.age) {
            System.out.println(m.name + " and " + f.name + " are of same age.\n");
        } else if (m.age > f.age) {
            System.out.println(m.name + " is the eldest. \n");
        } else {
            System.out.println(f.name + " is the eldest. \n");
        }
    }
}

class Man extends Human {
    int age;

    Man(String name, int age) {
        super(name, "male");
        this.age = age;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age + "\n");
    }
}

class Female extends Human {
    int age;

    Female(String name, int age) {
        super(name, "female");
        this.age = age;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age + "\n");
    }
}

class humanClass {
    public static void main(String[] args) {
        Man m = new Man("John", 43);
        m.display();
        Female f = new Female("Jenny", 45);
        f.display();
        Human.find(m, f);
    }
}
