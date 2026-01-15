package pattern;

public class Hollow_Increasing_Triangle {
    public static void main(String[] args) {
        System.out.println("Print the pattern");
        int n = 5;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                if(i == n || j == 1 || i == j){
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
