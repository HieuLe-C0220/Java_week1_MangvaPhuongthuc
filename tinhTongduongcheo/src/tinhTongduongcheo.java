import java.util.Scanner;

public class tinhTongduongcheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận vuông:");
        int size = scanner.nextInt();
        int [][]matran = new int[size][size];
        System.out.println("Nhập giá trị các phần tử trong ma trận: ");
        for (int i=0;i<matran.length;i++) {
            for (int j=0;j<matran[i].length;j++) {
                matran[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        int total = 0;
        for (int i=0;i<matran.length;i++) {
            total += matran[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông là "+total);
    }
}
