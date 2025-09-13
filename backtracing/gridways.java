package backtracing;

public class gridways {
    public static int gridway(int i,int j,int n, int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n ||j==m){ //boundary cross condition
            return 0;
        }
        //choice right
        int w1=gridway(i+1, j, n, m);
        //choice down
        int w2=gridway(i, j+1, n, m);
        int totalways=w1+w2;
        return totalways;
    }

    public static void main(String[] args) {
        int n=3, m=3; 
        System.out.println(gridway(0, 0, n, m));
    }
}
