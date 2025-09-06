package recursion;
public class tiling{
    public static int tile(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        
        //verticaltile
        int fnm1=tile(n-1);

        //horizontaltile
        int fnm2=tile(n-2);

        //total ways sum of the two ways
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String[] args) {
       System.out.println(tile(5));
    }
}