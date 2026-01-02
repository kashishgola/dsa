package pattern;

public class NumPattern28 {
    public static void main(String[] args) {
        System.out.println("print the pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == 1 || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
