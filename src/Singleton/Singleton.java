package Singleton;

public class Singleton {
    private Singleton(){ //private construtor so that not everyone can create a object.

    }
    private static Singleton instance; //variable of type class

    public static Singleton getInstance(){ //method
        if(instance == null)
        {
            instance = new Singleton(); //constructor
        }
        return instance;
    }

}
