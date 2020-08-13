public class ParameterPassing{
    public static void sumToN(int n){
        int sum = 0;
        for (int i = 1; i <= n; i ++){
            sum += i;
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        sumToN(20);
    }
}