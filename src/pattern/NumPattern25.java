package pattern;

public class NumPattern25 {
    public static void main(String[] args) {
        System.out.println("print the pattern");
        int n = 5;
        for(int i = 1, l = n; i <= n; i++, l--){
            int p = l;
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
