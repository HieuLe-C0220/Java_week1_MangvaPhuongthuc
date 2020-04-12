import java.util.Scanner;

public class GTNNtrongMang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]matrix = new int[3][3];
        System.out.println("Enter "+matrix.length+" rows and "+ matrix[0].length+" cols");
        for (int row = 0;row<matrix.length;row++) {
            for (int columns =0;columns<matrix[row].length;columns++) {
                matrix[row][columns] = scanner.nextInt();
            }
            System.out.println();
        }
        findMininArray(matrix);
    }
    public static void findMininArray(int [][]array) {
        int min = array[0][0];
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]<min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min in Array is: "+min);
    }
}
