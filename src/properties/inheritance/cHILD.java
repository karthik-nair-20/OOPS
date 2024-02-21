package properties.inheritance;

public class cHILD extends Box {
    int weight;

    cHILD(){
        super();
        this.weight = -1;
    }
    cHILD(int l,int b, int h ,int weight){
        super(l,b,h); //this will call the parent class with 3 args passed in constructor.
        this.weight = weight;
    }

    cHILD(int side){
        super(side);
    }

    cHILD(cHILD other){
        super(other);
        this.weight = other.weight;
    }
}
