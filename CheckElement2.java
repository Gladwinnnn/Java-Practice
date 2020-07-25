public class CheckElement2{
    public static void main(String[] args){
        int[] testData = {10, -20, 0 ,30, 40, 60, 10};
        System.out.print(testData.length >=2 && testData[0] == 10 | testData[testData.length - 1] == 0);
    }
}