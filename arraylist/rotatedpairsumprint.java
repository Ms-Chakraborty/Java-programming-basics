package arraylist;

import java.util.ArrayList;

public class rotatedpairsumprint {
    public static void rotatepair(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for (int i = 0; i < n; i++) {
            if(list.get(i)>list.get(i+1)){
                bp=i; break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(list.get(lp)+","+list.get(rp));
                int leftval=list.get(lp);
                int rightval=list.get(rp);
                while(lp!=rp && leftval==list.get(lp)){
                    lp=(lp+1)%n;
                }while(lp!=rp && rightval==list.get(rp)){
                    rp=(n+rp-1)%n;
                }
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=15;
        rotatepair(list, target);
    }
}
