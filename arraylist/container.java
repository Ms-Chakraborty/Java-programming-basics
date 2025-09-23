package arraylist;
import java.util.ArrayList;

public class container{
    //brute force
    public static int water(ArrayList<Integer> height){
        int watermax=Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int wh=Math.min(height.get(i), height.get(j));
                int wid=(j-i);
                int watervol=wh*wid;
                if(watervol>watermax){
                    watermax=watervol;
                }
            }
        }
        return watermax;
    }
    //two pointer approach
    public static int wateropti(ArrayList<Integer> height){
        int watermaximum=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(rp>lp){
            int wh=Math.min(height.get(lp), height.get(rp));
            int wid=rp-lp;
            int currwater=wh*wid;
            watermaximum=Math.max(watermaximum, currwater);
            if(height.get(rp)>height.get(lp)){
                 lp++;
            }else{
                rp--;
            }
        }
        return watermaximum;
    }

    public static void main(String[] args) {
        //1,8,6,2,5,4,8,3,7
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("The maximum volume of water:"+water(height));
        System.out.println("The faster approach to things:"+wateropti(height));
        
    }
}