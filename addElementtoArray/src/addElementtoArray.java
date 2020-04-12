import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class addElementtoArray {
    public static void main(String[] args) {
        int []hieu = new int[10];
        hieu[0] = 26;
        hieu[1] = 2;
        hieu[2] = 19;
        hieu[3] = 95;
        for (int i=0;i<hieu.length;i++) {
            System.out.print(hieu[i]+"\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn vào mảng: ");
        int input = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index<1 || index>=hieu.length-1) {
            System.out.println("Không chèn được nữa");
        }
        for (int i=hieu.length-1;i>index;i--) {
            hieu[i] = hieu[i-1];
        }
        hieu[index] = input;
        System.out.println(Arrays.toString(hieu));
    }
}
