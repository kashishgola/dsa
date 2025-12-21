package pattern;

public class NumPattern15 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1, p = 8; i <= n; i++, p -= 2){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = i; k <= n; k++){
                System.out.print(p+" ");
            }
            for(int l = i; l < n; l++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
