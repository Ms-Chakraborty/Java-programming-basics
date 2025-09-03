package recursion;

public class numin {
    public static void pin(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }else{
    pin(n-1);
    System.out.print(n+" ");
    }
    }
    public static void main(String[] args) {
       pin(5);
    }
}
