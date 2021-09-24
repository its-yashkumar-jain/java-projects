import java.io.*;
import java.util.*;

class employee {
    String name, type;
    int perks, id = 0;

    employee(String id, String name, String type) {
        this.id = Integer.valueOf(id);
        this.name = name;
        this.type = type;
    }

    void evaluatePerk() {
        if (type.toLowerCase().equals("p")) {
            perks += 5000;
        } else if (type.equals("ad")) {
            perks += 1000;
        }
    }
}

class sortById implements Comparator<employee> {
    public int compare(employee a, employee b) {
        return a.id - b.id;
    }
}

public class App {

    public static void printFileContent(String fileAddress) throws Exception {
        FileReader f = new FileReader(fileAddress);
        BufferedReader br = new BufferedReader(f);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println();
        br.close();
    }

    public static void main(String[] args) throws Exception {

        ArrayList<employee> ls = new ArrayList<employee>();

        FileReader f = new FileReader("D:/java-projects/lab-12/src/employee.txt");
        BufferedReader br = new BufferedReader(f);

        System.out.println("\nPrevious records: \n");
        App.printFileContent("D:/java-projects/lab-12/src/employee.txt");

        String s;
        while ((s = br.readLine()) != null) {
            String arr[] = s.split(" ");
            employee e = new employee(arr[0], arr[1], arr[2]);
            e.evaluatePerk();
            ls.add(e);
        }
        br.close();

        Collections.sort(ls, new sortById());
        FileWriter fw = new FileWriter("D:/java-projects/lab-12/src/newEmployee.txt");
        fw.write("ID\tName\tType\tPerks\n");
        for (employee i : ls) {
            fw.write(i.id + "\t" + i.name + "\t" + i.type + "\t" + i.perks + "\n");
        }
        fw.close();

        System.out.println("New records: \n");
        App.printFileContent("D:/java-projects/lab-12/src/newEmployee.txt");
    }
}
