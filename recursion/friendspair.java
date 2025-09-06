package recursion;

public class friendspair {
    public static int ways(int n){
        if(n==1 ||n==2){
            return n;
        }
        int single=ways(n-1);
        int pair=(n-1)*(ways(n-2));//because the pairing could be with anyone of the given set
        int total=pair+single;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(ways(3));
    }        
}

