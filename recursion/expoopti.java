package recursion;

public class expoopti {
    public static int optimizedpower(int a,int n){
        if(n==0){
            return -1;
        }
        int halfpower=optimizedpower(a,n/2);
        int halfpowsqrt=halfpower*halfpower;
        if(n%2!=0){
            halfpowsqrt=a*halfpowsqrt;
        }
        return halfpowsqrt;
    }
    public static void main(String[] args) {
        System.out.println(optimizedpower(5, 7));
    }
}
