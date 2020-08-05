public class OddEven{
    public static void main(String[] args){
        int[] testData = {10, -20, 0 ,30, 40, 60, 10};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < testData.length; i++){
            if (testData[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("ODD: " + odd);
        System.out.println("EVEN: " + even);
    }
}