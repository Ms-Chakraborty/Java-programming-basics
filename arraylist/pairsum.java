package arraylist;

import java.util.*;
public class pairsum {
     //brute force
    public static void pair(ArrayList<Integer> list,int target){
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+","+list.get(j));
                }
            }
        }
    }
    //two pointer approach
    public static void pairsopti(ArrayList<Integer> list, int target){
        Collections.sort(list);
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(rp)+list.get(lp)==target){
                System.out.println(list.get(lp)+","+list.get(rp));
                int leftVal = list.get(lp);
                int rightVal = list.get(rp);
                while(lp < rp && list.get(lp) == leftVal) lp++;
                while(lp < rp && list.get(rp) == rightVal) rp--;
            }else if(list.get(rp)+list.get(lp)<target){
                lp++;
            }else{
                rp--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(6);
        int target=8;
        pair(list, target);
        pairsopti(list, target);
    }

    
}
