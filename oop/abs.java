package oop;

public class abs {
    static abstract class Animal{
        String color;

        Animal() {
            color="brown";
        }
        
        void eat(){
            System.out.println("eats");
        }
        abstract void walk();//abstract methods has no implementation inside a function
    }
    static class Horse extends Animal{
        void changecolor(){
            color="Dark brown";
        }
        void walk(){
            System.out.println("4 legs");
        }
    }
    static class Chicken extends Animal{
        void walk(){
            System.out.println("2 legs");
        }
    }
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        Chicken ch=new Chicken();
        ch.walk();;
        ch.eat();
    }
}
