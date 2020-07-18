import java.util.Scanner;
import java.lang.Math; 

public class Earth{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = Math.toRadians(scanner.nextDouble());
        System.out.print("Input radius: ");
        double radius = scanner.nextDouble();
        double distance =  radius * Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));        
        System.out.print(distance);
    }
}