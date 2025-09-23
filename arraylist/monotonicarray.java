package arraylist;

import java.util.ArrayList;

public class monotonicarray {/* 
    public static boolean monotonic(ArrayList<Integer>nums){
        int n=nums.size();
        if(nums.get(0)>nums.get(1)){
            for (int i = 0; i < n-1; i++) {
                if(nums.get(i)<nums.get(i+1)){
                    return false;
                }
            }
        }else{for (int i = 0; i < n-1; i++) {
                if(nums.get(i)>nums.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }*/
    
    public static boolean monotonic(ArrayList<Integer> nums) {
    boolean inc = true, dec = true;
    for (int i = 0; i < nums.size() - 1; i++) {
        if (nums.get(i) < nums.get(i + 1)) dec = false;
        if (nums.get(i) > nums.get(i + 1)) inc = false;
    }
    return inc || dec;
}
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(4);
     System.out.println(monotonic(nums));
    }
}
