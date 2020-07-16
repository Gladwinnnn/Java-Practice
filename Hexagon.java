import java.util.Scanner;
import java.lang.Math; 

public class Hexagon{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        int length = scanner.nextInt();
        double area = (6 * (length*length))/(4*Math.tan(Math.PI/6));
        System.out.print(area);
    }
}