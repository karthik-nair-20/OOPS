package properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.l + "" + box1.w + "" + box1.h);

//        cHILD box2 = new cHILD();
//        System.out.println(box2.l + "" + box2.h +""+ box2.w + box2.weight);

//        cHILD box3 = new cHILD(1,2,3,4);
//        //how can i do it?
//        //check cHILD eg : super
//        System.out.println(box3.l + "" + box3.h +""+ box3.w + box3.weight);

//        Box box4 = new cHILD(1,2,3,4);
//        System.out.println(box4); // weight cannot b accessd as box4 has class Box.
//
//        Box box6 = new Box(1,2,3);
//
//        Box box5 = new Box(box6);
//        System.out.println(box5.l+""+box5.w+""+box5.h);

//        Boxprice price = new Boxprice(1,2,3,4);
//        System.out.println(price.price);
//
        Boxprice price2 = new Boxprice(7, 99);
        System.out.println(price2.l+" " + price2.w +" "+ price2.price);
    }
}
