package pattern;

public class CharPattern1 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    System.out.print("B ");
                }
                else{
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}
