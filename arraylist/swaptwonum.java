package arraylist;
import java.util.*;
public class swaptwonum {
    public static void swap(ArrayList<Integer> mylist,int idx1,int idx2){
        int temp=mylist.get(idx2);
        mylist.set(idx2,mylist.get(idx1));
        mylist.set(idx1,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>mylist=new ArrayList<>();
        mylist.add(1);mylist.add(2);mylist.add(3);mylist.add(4);mylist.add(5);
        System.out.print(mylist);
        int idx1=2,idx2=3;
       swap(mylist, idx1, idx2);
        System.out.print(mylist);
        Collections.sort(mylist,Collections.reverseOrder());
        System.out.print(mylist);
    }
    
}
