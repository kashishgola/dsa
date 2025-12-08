package pattern;

public class SymbolPattern {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                if(i % 2 == 0){
                    System.out.print("$ ");
                }
                else{
                    System.out.print("# ");
                }
            }
            for(int l = 1; l < i; l++){
                if(i % 2 == 0){
                    System.out.print("$ ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
