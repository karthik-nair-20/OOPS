package oop5.Interface;

public class Car implements Engine,Brake,Media{

    int a=10;
    @Override
    public void stop() {
        System.out.println("i bake like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i acc like a noraml car");
    }

    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");

    }
}
