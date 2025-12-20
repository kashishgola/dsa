package pattern;

public class NumPattern12 {
    public static void main(String[] args) {
        System.out.println("Print the number pattern");
        int n = 5;
        for(int i = 1, p = 8; i <= n; i++, p -= 2){
            for(int j = i; j <= n; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }

    }
}
