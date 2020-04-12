public class timGTNNtrongMang {
    public static void main(String[] args) {
        int []arr = {26,36,25,16,6,7,17};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: "+arr[index]);
    }
    public static int minValue(int[] array) {
        int min = array[0];
        int vitri = 0;
        for (int i=1;i<array.length;i++) {
            if (array[i]<min) {
                min = array[i];
                vitri = i;
            }
        }
        return vitri;
    }
}
