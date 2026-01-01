package pattern;

public class NumPattern27 {
    public static void main(String[] args) {
        System.out.println("print the pattern");
        int n = 4 , p = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
