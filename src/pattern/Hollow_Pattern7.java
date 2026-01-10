package pattern;

public class Hollow_Pattern7 {
    public static void main(String[] args) {
        System.out.println("Print the hollow pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i % 2 != 0){
                    System.out.print("* ");
                }
                else if(j == 1 || j == n){
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
