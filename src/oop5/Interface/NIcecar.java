package oop5.Interface;

public class NIcecar {
    private Engine engine;
    public NIcecar(){
        engine = new powerEngine();
    }

    public NIcecar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

}
