package functions;

public class calculator {
    public static int sum( int a, int b){//sum of two
        return a+b;
    }
    public static int sum( int a, int b, int c){//calculate sum of three
        return a+b+c;
    }
    public static float sum( float a, float b){//sum of two
        return a+b;
    }
    public static void main(String[] args) {
    System.out.println(sum(3,5));
    System.out.println(sum(3,5,4));
    System.out.println(sum(3.2f,5.5f));
    }    
}
