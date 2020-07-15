import java.util.Scanner;
import java.util.ArrayList;

public class Sum{
    public static void main(String[] args){
        ArrayList<String> numbers = new ArrayList<String>();
        int intHolder = 0;
        int intHolder2 = 0;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String placeHolder = scanner.nextLine();
        for (int i = 0; i < placeHolder.length(); i++){
            numbers.add(placeHolder.substring(intHolder, i+1));
            intHolder += 1;
        }

        for (int i = 0; i < numbers.size(); i++){
            int test = Integer.parseInt(numbers.get(i));
            total += test;
            intHolder2 += 1;
        }

        System.out.print(total);
    }
}