package oop;

public class stat {
    class Student{
        String name;
        int roll;
        static String schooname;
        static float  returnPercentage(int phy, int chem, int bio){
            float percent=((phy+chem+bio)/300)*100;
            return percent;
        }
        String getname(){
            return this.name;
        }
        void setname(String name){
            this.name=name;
        }
    }
}
