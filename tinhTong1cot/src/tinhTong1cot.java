import java.util.Arrays;
import java.util.Scanner;

public class tinhTong1cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();
        int [][]mang = new int[size][size];
        System.out.println("Nhập các giá trị của phần tử trong mảng");
        for (int i=0;i<mang.length;i++) {
            for (int j=0;j<mang[i].length;j++) {
                mang[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("Bạn muốn tính tổng ở cột số mấy: ");
        int cols = scanner.nextInt();
        int total = 0;
        for (int row=0;row<mang.length;row++) {
            total += mang[row][cols];
        }
        System.out.println("Tổng của cột: "+cols+" là: "+total);
    }
}
