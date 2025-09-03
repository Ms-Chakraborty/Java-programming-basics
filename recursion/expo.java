package recursion;

public class expo {
    public static  int calc(int x,int n ){
       
        if(n==1){
            return x;
        }else  {
            return x*(calc(x, n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(calc(5,2));
    }
}
