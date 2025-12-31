package pattern;

public class NumPattern24 {
    public static void main(String[] args) {
        System.out.println("print the pattern");
        int n = 5;
        for(int i = 1, l = n-1; i <= n; i++, l--){
            int p = 5;
            for(int j = 1; j <= i;  j++){
                System.out.print("  ");
            }
            for(int k = i; k <=n; k++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
    }
}
