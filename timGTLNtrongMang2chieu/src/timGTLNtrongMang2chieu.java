public class timGTLNtrongMang2chieu {
    public static void main(String[] args) {
        double [][]mangsothuc = {
                {3.6,5.8,6.3,5.4,3.5},
                {5,12,4.8,9.6},
                {4,8,9,7.6,8.2,4.1}
        };
        findMaxinArray(mangsothuc);
    }
    static void findMaxinArray(double [][]array) {
        double max = array[0][0];
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]>max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max in Array is: "+max);;
    }
}
