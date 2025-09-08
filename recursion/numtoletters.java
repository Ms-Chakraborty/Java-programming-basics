package patterntwo.recursion;

public class numtoletters {
    public static void number(int num){
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(num==0){
            return;
        }
        int i=num%10;
        
        number(num/10);
        System.out.print(arr[i]+" ");
    }public static void main(String[] args) {
        number(125);
    }
}
