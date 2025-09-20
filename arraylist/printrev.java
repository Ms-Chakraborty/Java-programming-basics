package arraylist;
import java.util.*;
public class printrev {
    public static void main(String[] args) {
        ArrayList<Integer>mylist=new ArrayList<>();
         mylist.add(1);mylist.add(2);mylist.add(3);mylist.add(4);mylist.add(5);
         for (int i = mylist.size()-1; i >=0; i--) {
             System.out.print(mylist.get(i)+" ");
         }
    }
}
