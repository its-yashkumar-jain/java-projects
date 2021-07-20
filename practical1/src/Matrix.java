import java.util.Scanner;

public class Matrix {
    int rows, columns;
    int[][] arr;

    Matrix() {
        this.rows = 1;
        this.columns = 1;
    }

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    void getData() {
        this.arr = new int[this.rows][this.columns];

        System.out.print("Enter (" + this.rows * this.columns + ") elements of the matrix : ");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void showMatrix() {
        System.out.println();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(2, 3);
        m.getData();
        m.showMatrix();
    }
}
