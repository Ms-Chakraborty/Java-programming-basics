package backtracing;

public class subsets {
    public static void subsetsstr(String str,int i,String ans){
        if(i==str.length()){
        if(ans.length()==0){
            System.out.print("null");
         }else{
            System.out.print(ans+",");
        }
        return;
        }
        //recursion
        //yes choice
        subsetsstr(str, i+1, ans+str.charAt(i));
        //no choice
        subsetsstr(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str="abcd";
        String ans="";
        subsetsstr(str, 0, ans);
    }
}
