import java.util.Scanner;

public class LowerCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        String result = sentence.toLowerCase();
        System.out.print(result);
    }
}