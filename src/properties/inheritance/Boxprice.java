package properties.inheritance;

public class Boxprice extends cHILD{
    int price;
    Boxprice(int l, int w, int h, int weight){
        super(l,w,h,weight);
        this.price = -1;
    }

    Boxprice(int side, int price){
        super(side);
        this.price = price;
    }

}
