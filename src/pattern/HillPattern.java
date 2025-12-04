package pattern;

public class HillPattern {
    public static void main(String[] args) {
        System.out.println("Print the program");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k < i ; k++){
                System.out.print("* ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
