import java.util.Scanner;

public class demSoluong {
    public static void main(String[] args) {
        int size;
        double []bangdiem;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size>30)
                System.out.println("Size should not exceed 30");
        } while (size>30);
        bangdiem = new double[size];
        int i=0;
        while (i<bangdiem.length) {
            System.out.print("Enter a mark for student "+(i+1)+": ");
            bangdiem[i] = scanner.nextDouble();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j=0;j<bangdiem.length;j++) {
            System.out.print(bangdiem[j]+"\t");
            if (bangdiem[j]>5&&bangdiem[j]<=10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
