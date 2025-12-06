package pattern;
import java.util.*;

public class DoubleHill {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){  // rows
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            // System.out.println();
            for(int l = i; l < n; l++){
                System.out.print("  ");
            }
            for(int m = 1; m <= i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
