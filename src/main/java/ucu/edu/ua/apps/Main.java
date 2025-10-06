package ucu.edu.ua.apps;

public class Main {
    public static void main(String[] args) {
        //CHECKSTYLE:OFF
        FlowerColor flowerColor = FlowerColor.RED;
        System.out.println(flowerColor); // "#FF0000"    
        Flower flower = new Flower(100, 
                                   FlowerColor.RED, 
                                   100, 
                                   FlowerType.ROSE);    
        //CHECKSTYLE:ON
    }
}