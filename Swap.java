public class Swap{
    public static void main(String[] args){
        String test1 = "Hello";
        String test2 = "World";
        System.out.println(test1 + test2);
        System.out.println("I will proceed to swap the places of the above");
        String placeHolder = test1;
        test1 = test2;
        test2 = placeHolder;
        System.out.println("This is the new word: " + test1 + test2);
    }
}