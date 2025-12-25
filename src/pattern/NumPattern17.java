package pattern;

public class NumPattern17 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5, p = 1;
        for(int i = 1; i < n; i++, p++){
            for(int j = 1; j <= i; j++){
                System.out.print(p+" ");
            }
            for(int k = i; k < n; k++){
                System.out.print("  ");
            }
            for(int l = i; l < n; l++){
                System.out.print("  ");
            }
            for(int m = 1; m <= i; m++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
//=========================================
        for(int i = 1; i <= n; i++, p++){
            for(int j = i; j <= n; j++){
                System.out.print(p+" ");
            }
            for(int k = 1; k < i; k++){
                System.out.print("  ");
            }
            for(int l = 1; l < i; l++){
                System.out.print("  ");
            }
            for(int m = i; m <= n; m++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
