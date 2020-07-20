import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sentence = scanner.nextLine();
        String reverse = "";
        for (int i = sentence.length()-1; i >= 0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.print("Reverse string: " + reverse);
    }
}