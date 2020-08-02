public class Compare3{
    public static void main(String[] args){
        int[] testData1 = {20, 30, 90, 50, 67};
        int largest = testData1[0];
        for (int i = 2; i < testData1.length; i += 2){
            if (testData1[i] > largest){
                largest = testData1[i];
            }
        }
        System.out.print(largest);
    }
}