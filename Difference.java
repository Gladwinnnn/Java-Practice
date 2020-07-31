import java.lang.*;

public class Difference{
    public static void main(String[] args){
        int[] testData = {40, 30, 20};
        int first = testData[0];
        int last = testData[testData.length-1];
        int difference = Math.abs(last - first);
        System.out.print("Larger value between first and last element: " + difference);
    }
}