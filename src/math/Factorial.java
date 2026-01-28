package math;

import java.util.*;
public class Factorial {
    public static int factNumber(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
        public static void main(String[] args) {
            System.out.println("Factorial");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int fact = factNumber(num);
            System.out.println("Reversed Number " + fact);
        }
}
