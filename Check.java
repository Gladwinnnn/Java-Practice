public class Check{
    public static void main(String[] args){
        int number = 100;
        if (number > 0){
            System.out.println(number + " is a positive number");
        }
        else if (number < 0){
            System.out.println(number + " is a negative number");
        }
        else{
            System.out.println(number + " is neither positive nor negative");
        }
    }
}