package arraylist;

import java.util.ArrayList;

public class lonelynum {
   public static void alonenum(ArrayList<Integer> nums){
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.size(); i++) {
        int curr = nums.get(i);
        // Check if curr appears only once
        if (nums.indexOf(curr) != nums.lastIndexOf(curr)) {
            continue; // skip if duplicate
        }
        boolean isLonely = true;
        for (int j = 0; j < nums.size(); j++) {
            if (i != j && (nums.get(j) == curr - 1 || nums.get(j) == curr + 1)) {
                isLonely = false;
                break;
            }
        }
        if (isLonely) {
            result.add(curr);
        }
    }
    System.out.println(result);
}
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        alonenum(nums);
    }
}
