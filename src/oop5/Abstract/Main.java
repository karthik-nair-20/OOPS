package oop5.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        Parent daughter = new Daughter();
        daughter.career();

        Parent mom = new Parent() {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };

    }
}
