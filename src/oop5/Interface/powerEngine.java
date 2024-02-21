package oop5.Interface;

public class powerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("pwer start");
    }

    @Override
    public void stop() {
        System.out.println("power stop");

    }

    @Override
    public void acc() {
        System.out.println("power acc");

    }
}
