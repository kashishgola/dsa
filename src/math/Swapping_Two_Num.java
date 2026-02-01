package math;

public class Swapping_Two_Num {
    public static void main(String[] args) {
        System.out.println("Swapping the two number");
        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+ a +" , b =" +b);
    }
}
