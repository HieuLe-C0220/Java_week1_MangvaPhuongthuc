import java.util.Scanner;

public class solanxuathien {
    public static void main(String[] args) {
        String x = "Toi dang hoc ngon ngu lap trinh Java";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu muon kiem tra");
        char a = scanner.next().charAt(0);
        int count =0;
        for (int i=0;i<x.length();i++) {
            if (x.charAt(i)==a) {
                count++;
            }
        }
        if (count ==0) {
            System.out.printf("Ky tu %s khong co trong chuoi",a);
        } else {
            System.out.printf("Ky tu %s xuat hien trong chuoi %d lan",a,count);
        }
    }
}
