package pattern;

public class NumPattern7 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int k = i; k <= n; k++){
                if(i % 2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            for(int l = i; l < n; l++){
                if(i % 2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
