package recursion;

public class sum {
    public static int firstsum(int n){
        int sum;
        if(n==1){
            return 1;
        }
        else{
            sum=n+firstsum(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println(firstsum(5));
    }    
}
