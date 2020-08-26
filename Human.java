public class Human{
    private String name;
    private double weight;
    private double height;

    // constructor (something like a method)
    public Human(){
        name = "nameless";
        weight = 0;
        height = 0;
    }

    public Human(String n, double w, double h){
        name = n;
        weight = w;
        height = h;
    }

    public double calculateBMI(){
        double toReturn = weight / (height * height);
        return toReturn;
    }

    public boolean isHeavierThan(Human anotherHuman){
        return weight - anotherHuman.getWeight() > 0;
    }

    public double getWeight(){
        return weight;
    }
}