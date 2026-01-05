package pattern;

public class Hollow_Pattern1 {
    public static void main(String[] args) {
        System.out.println("Print the pattern");
        int n = 5;
        for(int i = 1; i < n; i++){
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
        //=====================
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = i; k < n; k++){
                System.out.print("* ");
            }
            for(int l = i; l <= n; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
