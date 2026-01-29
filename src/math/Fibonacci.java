package math;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < num; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
