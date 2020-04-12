import java.util.Arrays;
import java.util.Scanner;

public class delElementtoArray {
    public static void main(String[] args) {
        int[]mang = {10,4,6,7,8,6,0,0,0};
        System.out.println(Arrays.toString(mang));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số muốn xoá: ");
        int number = scanner.nextInt();
        delElement(mang,number);
    }
    static void delElement(int[]array,int n) {
        int index_del = 0;
        for (int i=0;i<array.length;i++) {
            if (n==array[i]) {
                index_del = i;
            }
        }
        for (int j=index_del;j<array.length-1;j++) {
            array[j]=array[j+1];
        }
        System.out.println(Arrays.toString(array));
    }
}
