package pattern;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a = 1; a < n; a++){
            for(int b = a; b <= n; b++){
                System.out.print("  ");
            }
            for(int c = 1; c <= a; c++){
                System.out.print("* ");
            }
            for(int d = 1; d < a; d++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // =====Reverse hill pattern=====
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = i; k <= n; k++){
                System.out.print("* ");
            }
            for(int r = i; r < n; r++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
