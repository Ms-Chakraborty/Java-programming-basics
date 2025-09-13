package backtracing;

public class permutations {
    public static void permutestr(String str, String ans){
        if(str.length()==0 ){
            System.out.print(ans+" ");
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            String curr=str.substring(0,i)+str.substring(i+1,str.length());//removoing the ith element from the original string
          permutestr(curr, ans+str.charAt(i));  //moving that particular character from str to ans
        }
        
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        permutestr(str, ans);
    }
}
