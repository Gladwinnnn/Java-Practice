public class Larger{
    public static void main(String[] args){
        int[] testData = {40, 30, 20};
        int placeHolder = testData[0];
        for (int i = 1; i < testData.length; i++){
            if (placeHolder < testData[i]){
                placeHolder = testData[i];
            }
        }
        System.out.print("Larger value between first and last element: " + placeHolder);
    }
}