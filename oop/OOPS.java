package oop;

public class OOPS {
    public static void main(String[] args) {
            Pen p1=new Pen();
                p1.setColor("Blue");
                p1.setTip(5);
                System.out.println("Color: " + p1.color);
                System.out.println("Tip: " + p1.tip);
            Student s1=new Student("Aman",23);
                s1.marks[0]=100;
                s1.marks[1]=89;
                s1.marks[2]=90;
            Student s2=new Student(s1);
                for(int i=0;i<3;i++)    
                    System.out.println(s2.marks[i]);

    }
    
}
class Pen{
    //prop+func
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int roll;
    int[] marks= new int[3];
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
        
    }
    //shallow copy constructor
    /*Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }*/
    //deep constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    
}