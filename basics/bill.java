import java.util.*;
public class bill {
    public static void main(String args[]){
        try( Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the price of the pen: ");
            float pen=sc.nextFloat();
            System.out.print("Enter the price of the pencil: ");
            float pencil=sc.nextFloat();
            System.out.print("Enter the price of the eraser: ");
            float eraser=sc.nextFloat();
            float total=(pen+pencil+eraser);
            float tax=(18%(total));
            float bill=((tax)+(total));
            System.out.println(("The total bill after tax :")+(bill));
        }
    }
    
}
