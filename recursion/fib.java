package recursion;

public class fib {
    public static int fibonacci(int n){
        int fibsum;
        if(n==0){
            fibsum=0;
            return fibsum;
        }else if(n==1) {
            fibsum=1;
            return fibsum;
        }else{
            fibsum=fibonacci(n-1)+fibonacci(n-1);
            return fibsum;
        }
    }
    public static void main(String[] args) {
        System.out.print(fibonacci(27));
    }
}
