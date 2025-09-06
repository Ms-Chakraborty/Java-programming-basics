package recursion;
public class removeduplicates{
    public static void remove(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            remove(str, idx+1, newstr, map); //duplicate
        }else{
            map[currchar-'a']=true;
            remove(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}