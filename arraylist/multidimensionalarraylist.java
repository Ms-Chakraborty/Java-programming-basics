package arraylist;

import java.util.ArrayList;

public class multidimensionalarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>mylist=new ArrayList<>();
        ArrayList<Integer>mylist1=new ArrayList<>();
        mylist.add(9);mylist.add(5);mylist.add(7);mylist.add(12);
        mainlist.add(mylist);
        mylist1.add(19);mylist1.add(55);mylist1.add(37);mylist1.add(23);
        mainlist.add(mylist1);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer>currList=mainlist.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
