package array;
import java.util.*;

public class create{
    public static void main(String args[]) {
        int marks[]= new int[3];

        try(Scanner sc= new Scanner(System.in)){
            for(int i=0;i<3;i++ ){
                System.out.println("Enter the marks of ith element "+i+" th subject:");
                marks[i]=sc.nextInt();
                int total=+(marks[i]);
                int percentage=(total/3);

            }
           
        }
    }
}
