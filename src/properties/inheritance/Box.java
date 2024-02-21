package properties.inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box()
    {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(int l, int w, int h) {
//        super();
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;;
        this.w = old.w;
    }

    public void info(){
        System.out.println("box is runnning");
    }
}
