import java.util.ArrayList; // to be able to use ArrayList

public class ArrayListTest{
    public static void main(String[] args){
        // code
        ArrayList<Integer> numberArrayList = new ArrayList<Integer>();
        numberArrayList.add(0);
        numberArrayList.add(1);
        numberArrayList.add(2);
        System.out.println(numberArrayList.size());
        System.out.println(numberArrayList.get(0));
    }
}