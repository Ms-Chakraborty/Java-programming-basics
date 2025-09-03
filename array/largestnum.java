package array;

public class largestnum {
    public static int largefind(int marks[]){
        int large=-999;
        for (int i = 0; i < marks.length; i++) {
            if(large<marks[i]){
                large=marks[i];
            }
        }
        return large;
        

    }
    public static void main(String[] args) {
        int marks[]={65,76,98,70,99};
        System.out.println("The highest marks in the array:"+largefind(marks));
    }
}
