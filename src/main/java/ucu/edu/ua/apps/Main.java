package ucu.edu.ua.apps;

import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        FlowerColor flowerColor = FlowerColor.RED;
        System.out.println(flowerColor); // "#FF0000"    
        Flower flower = new Flower(100, FlowerColor.RED, 100, FlowerType.ROSE);    
    }
}