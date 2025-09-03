package oop;

public class inheritance {
    static class Animal{
        String color;
        void eat(){
            System.out.println("Eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
    }
    static class Mammal extends Animal{
        int legs;
    }
    static class Dog extends Mammal{
        String breed;
        void setBreed(String breed) {
        this.breed = breed;
    }
    }
    static class Cat extends Mammal{
        String breed;
        void setBreed(String breed) {
            this.breed = breed;
        }
        void purrs(){
            System.out.println("Purrs");
        }
    }
    
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.setBreed("lab");
        dobby.eat();
        dobby.breathe();
        dobby.legs=4;
        dobby.color="red";
        dobby.breed="lab";
        System.out.println(dobby.legs);
    } 
}
