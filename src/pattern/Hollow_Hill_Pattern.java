package pattern;

public class Hollow_Hill_Pattern {
    public static void main(String[] args) {
        System.out.println("Print the pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k < i; k++){
                if( k == 1 || i == n ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int l = 1; l <= n; l++){
                if(l == i || i == n){
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
