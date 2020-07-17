import java.util.Scanner;
import java.lang.Math; 

public class Polygon{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int sides = scanner.nextInt();
        System.out.print("Input the length of one of the sides: ");
        int length = scanner.nextInt();
        double area = (sides * (length*length))/(4*Math.tan(Math.PI/sides));
        System.out.print(area);
    }
}