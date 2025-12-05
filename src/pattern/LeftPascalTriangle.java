package pattern;
import java.util.*;

public class LeftPascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // ====Reverse pattern======
        for(int a = 1; a <= n; a++){
            for(int b = a; b < n; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
