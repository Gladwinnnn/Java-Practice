public class DivideBy3And5{
    public static void main(String[] args){
        String three = "";
        String five = "";
        String threeAndFive = "";
        for (int i = 1; i < 101; i ++){
            if (i % 15 == 0){
                threeAndFive += i + ", ";
            }
            else if (i % 5 == 0){
                five += i + ", ";
            }
            else if (i % 3 == 0){
                three += i + ", ";
            }
        }
        System.out.println("Divided by 3:");
        System.out.println(three.substring(0,three.length()-2));
        System.out.println("Divided by 5:");
        System.out.println(five.substring(0, five.length()-2));
        System.out.println("Divided by 15:");
        System.out.println(threeAndFive.substring(0, threeAndFive.length()-2));
    }
}