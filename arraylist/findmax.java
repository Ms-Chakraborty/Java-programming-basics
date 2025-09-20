package arraylist;

import java.util.ArrayList;

public class findmax {
    public static void main(String[] args) {
        ArrayList<Integer>mylist=new ArrayList<>();
         mylist.add(2);mylist.add(5);mylist.add(9);mylist.add(3);mylist.add(6);
         int maxval=Integer.MIN_VALUE;
         for (int i = 0; i < mylist.size(); i++) {
             if(mylist.get(i)>maxval){
                maxval=mylist.get(i);
             }
         }
         System.out.println("The highest element is "+maxval);
    }
}
