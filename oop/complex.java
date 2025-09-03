package oop;
public class complex{
    public static void main(String[] args) {
        Complex c=new Complex(3,2,1,7);
        c.sum();
        c.diff();
        c.product();
    }
    
    static class Complex{
        int real1;
        int im1;
        int real2;
        int im2;
        Complex(int real1,int imp1,int real2,int im2){
            this.real1=real1;
            this.im1=imp1;
            this.real2=real2;
            this.im2=im2;
        }
        public void sum(){
            int realsum=this.real1+this.real2;
            int imsum=this.im1+this.im2;
            System.out.println("The sum is: " + realsum + " + " + imsum + "i");
        }

        public void diff(){
            int realdiff=this.real1-this.real2;
            int imdiff=this.im1-this.im2;
            System.out.println("The difference is: " + realdiff + " + " + imdiff + "i");
        }
        public void product(){
            int realproduct=(this.real1*this.real2)-(this.im1*this.im2);
            int improduct=(this.real1*this.im2)+(this.real2*this.im1);
            System.out.println("The product is: " + realproduct + " + " + improduct + "i");
        }

    }
}