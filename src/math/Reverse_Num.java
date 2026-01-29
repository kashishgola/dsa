package math;
import java.util.*;
public class Reverse_Num {
    public static int reverseNumber(int n){
        int rev = 0, r ;
        while(n > 0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n/ 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Reverse Series");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int rev = reverseNumber(no);
        int a = no;
        System.out.println("Original Number " + a);
        System.out.println("Reversed Number " + rev);
    }
}
