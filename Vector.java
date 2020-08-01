public class Vector{
    public static void main(String[] args){
        int[] testData1 = {1, 3, -5, 4};
        int[] testData2 = {1, 4, -5, -2};
        String output = "";
        for (int i = 0; i < testData1.length; i++){
            int total = testData1[i] * testData2[i];
            output += Integer.toString(total) + " ";
        }
        System.out.print(output);
    }
}