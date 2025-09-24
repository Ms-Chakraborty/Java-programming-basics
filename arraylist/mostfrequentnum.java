package arraylist;

import java.util.ArrayList;

public class mostfrequentnum {
    public static int alonenum(ArrayList<Integer> nums,int key){
    int[] result=new int[1000];
    for (int i = 0; i < nums.size()-1; i++) {
        if(nums.get(i)==key){
            int target=nums.get(i+1);
            result[target]++;
        }
    }
    int maxFreq = 0;
        int mostFrequentNum = -1;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > maxFreq) {
                maxFreq = result[i];
                mostFrequentNum = i;
            }
        }

        return mostFrequentNum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key=1;
        System.out.println(alonenum(nums, key));
    }

}
