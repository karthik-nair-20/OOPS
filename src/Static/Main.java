package Static;

public class Main {
    public static void main(String[] args) {
        Human karthik = new Human(21,"karthik",23000,false);
        Human Kunal= new Human(24,"kUNAL",60000,true);
        Human Kanishk= new Human(24,"kanishk",60000,true);

        System.out.println(Human.population);
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("hello");
    }
}

