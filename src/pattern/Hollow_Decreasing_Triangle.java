package pattern;

public class Hollow_Decreasing_Triangle {
    public static void main(String[] args) {
        System.out.println("Print the pattern");
        int n = 5;
        for(int i = 1; i <= n ; i++){
            for(int j = i; j <= n; j++){
                if(i == 1 || j == i || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
