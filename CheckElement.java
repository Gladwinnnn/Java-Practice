public class CheckElement{
    public static void main(String[] args){
        int[] testData = {50, -20, 0, 30, 40, 60, 10};
        boolean result = check(testData);
        System.out.println(result);
    }

    public static boolean check(int[] args){
            if (args.length < 2)
            {
                return false;
            }
            else
            {         
                if (args[0] != args[args.length - 1]){
                    return false;
                }

                else
                {
                    return true;
                }
            }
    }
}