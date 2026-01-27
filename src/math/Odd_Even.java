package math;

import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Find the Odd & Even number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
