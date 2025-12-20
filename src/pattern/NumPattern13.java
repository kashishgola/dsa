package pattern;

public class NumPattern13 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1, p = 0; i <= n; i++, p += 2 ){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(p+" ");
            }
            for(int l = 1; l < i; l++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
